package inheritance;

import utils.Money;
import utils.Wallet;

import java.math.BigDecimal;

public class DebitCard implements PaymentMethod {
    @Override
    public Boolean processPayment(Wallet wallet, Money amount) {
        Money balance = wallet.getBalance();

        if (balance.compareTo(amount) >= 0) {
            wallet.debit(amount);
            Money newBalance = wallet.getBalance();

            System.out.println("Payment successful! Current balance is: " + newBalance);
            return true;
        }

        BigDecimal shortfall = balance.subtract(amount).abs();
        System.out.println("Payment failed! You are short of: " + shortfall);
        return false;
    }
}

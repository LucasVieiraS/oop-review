package implementation;

import utils.Money;
import inheritance.Wallet;

import java.math.BigDecimal;

public class CreditCard implements PaymentMethod {
    private final Money creditLimit = Money.of("BRL", 1000.0);

    @Override
    public Boolean processPayment(Wallet wallet, Money amount) {
        Money balance = wallet.getBalance();

        Money available = balance.add(creditLimit);

        if (available.compareTo(amount) >= 0) {
            wallet.debit(amount);
            Money newBalance = wallet.getBalance();

            System.out.println("Payment successful using Credit Card! Current balance is: " + newBalance);
            return true;
        }

        BigDecimal shortfall = amount.subtract(available).abs();
        System.out.println("Payment failed! You are over your credit limit by: " + shortfall);
        return false;
    }
}

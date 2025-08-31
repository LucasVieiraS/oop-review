package inheritance;

import utils.Money;
import utils.Wallet;

public interface PaymentMethod {
    Boolean processPayment(Wallet wallet, Money money);
}

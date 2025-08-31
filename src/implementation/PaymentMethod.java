package implementation;

import utils.Money;
import inheritance.Wallet;

public interface PaymentMethod {
    Boolean processPayment(Wallet wallet, Money money);
}

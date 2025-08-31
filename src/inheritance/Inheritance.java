package inheritance;

import utils.Money;
import utils.Wallet;

// Idea: Reuse code and model “is-a” relationships.
// Why: Base class defines common behavior, subclasses specialize.
// In this example, the inheritance happens in CreditCard and DebitCard, inheriting from PaymentMethod.
public class Inheritance {
    public static void runInheritance() {
        System.out.println("Inheritance - Payment Gateway example:");

        Gateway paymentGateway = new Gateway();

        // Debit example
        Wallet wallet = new Wallet(Money.of("BRL", 200));
        DebitCard debitCard = new DebitCard();

        paymentGateway.processPayment(wallet, debitCard, Money.of("BRL", 150));
        paymentGateway.processPayment(wallet, debitCard, Money.of("BRL", 400));

        // Credit example
        Wallet creditWallet = new Wallet(Money.of("BRL", 100));
        CreditCard creditCard = new CreditCard();

        paymentGateway.processPayment(creditWallet, creditCard, Money.of("BRL", 50));
        paymentGateway.processPayment(creditWallet, creditCard, Money.of("BRL", 500));
        paymentGateway.processPayment(creditWallet, creditCard, Money.of("BRL", 2000));
    }
}

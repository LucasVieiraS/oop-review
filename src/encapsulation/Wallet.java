package encapsulation;

import utils.Money;

// Group related state + behavior into a single unit, and hide internal details from outside.
// Protects invariants, reduces coupling, keeps code maintainable.
public class Wallet {
    private Money balance;

    public void debit(Money amount) {
        if (balance.compareTo(amount) < 0) throw new IllegalStateException("Insufficient funds");
        balance = balance.subtract(amount);
    }

    public Money getBalance() {
        return balance;
    }
}

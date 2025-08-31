package inheritance;

import utils.Money;

public abstract class Account {
    protected Money balance;

    public Account(Money balance) {
        this.balance = balance;
    }

    public void credit(Money amount) {
        this.balance = this.balance.add(amount);
    }

    public void debit(Money amount) {
        this.balance = this.balance.subtract(amount);
    }

    public Money getBalance() {
        return balance;
    }

    // Hook method, subclasses can override to enforce rules
    protected abstract String getAccountType();
}

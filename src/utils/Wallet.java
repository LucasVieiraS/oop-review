package utils;

public class Wallet {
    Money balance;

    public Wallet(Money balance) {
        this.balance = balance;
    }

    public void debit(Money amount) {
        this.balance = this.balance.subtract(amount);
    }

    public void credit(Money amount) {
        this.balance = this.balance.add(amount);
    }

    public Money getBalance() {
        return balance;
    }
}

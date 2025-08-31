package utils;

import java.math.BigDecimal;
import java.util.Currency;

public final class Money {
    private final BigDecimal amount;
    private final Currency currency;

    Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money of(String currencyCode, double value) {
        return new Money(BigDecimal.valueOf(value), Currency.getInstance(currencyCode));
    }

    public Money add(Money other) {
        checkCurrency(other);
        return new Money(this.amount.add(other.amount), this.currency);
    }

    public Money subtract(Money other) {
        checkCurrency(other);
        return new Money(this.amount.subtract(other.amount), this.currency);
    }

    public int compareTo(Money other) {
        checkCurrency(other);
        return this.amount.compareTo(other.amount);
    }

    public BigDecimal abs() {
        return this.amount.abs();
    }

    public boolean isNegative() {
        return this.amount.compareTo(BigDecimal.ZERO) < 0;
    }

    private void checkCurrency(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Different currencies not supported");
        }
    }

    @Override
    public String toString() {
        return amount + " " + currency.getCurrencyCode();
    }
}

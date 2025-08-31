package inheritance;

import utils.Money;

public class Wallet extends Account {
    public Wallet(Money balance) {
        super(balance);
    }

    @Override
    protected String getAccountType() {
        return "Wallet";
    }
}

package abstraction;

import utils.Money;
import utils.Wallet;

// Idea: Focus on what an object does, not how it does it.
// Why: Helps build APIs/interfaces that are easier to use and extend.
// i.e. interfaces and abstract classes.
interface PaymentMethod {
    boolean processPayment(Wallet wallet, Money amount);
}

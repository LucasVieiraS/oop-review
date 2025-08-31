package inheritance;

import utils.Money;
import utils.Wallet;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Gateway {
    private final List<String> transactionLogs = new ArrayList<>();

    public Boolean processPayment(Wallet wallet, PaymentMethod paymentMethod, Money money) {
        Boolean status = paymentMethod.processPayment(wallet, money);

        UUID uuid = UUID.randomUUID();
        this.registerTransactionLog(uuid, status);

        int txNumber = transactionLogs.size() + 1;
        String txStatus = status ? "Successful" : "Failed";
        System.out.println("Transaction " + txNumber + " (" + uuid + ") | Status: " + txStatus);

        return status;
    }

    public List<String> getLogs() {
        return transactionLogs;
    }

    private void registerTransactionLog(UUID paymentId, Boolean status) {
        String parsedPaymentId = paymentId.toString();
        String formattedDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        String finalTransactionLog = "Pagamento processado em: " + formattedDate
                + ", ID: " + parsedPaymentId
                + " Status: " + status;

        this.transactionLogs.add(finalTransactionLog);
    }
}

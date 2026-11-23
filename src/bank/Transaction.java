package bank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private final LocalDateTime date = LocalDateTime.now();

    private final BigDecimal amount;

    private final String accountNumber;

    private final TransactionType transactionType;

    public Transaction(BigDecimal amount, String accountNumber, TransactionType transactionType) {
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public String getTransactionInformation() {
        return getDate() + " | " + getAccountNumber() + " | " + getAmount() + " | " + getTransactionType();
    }
}
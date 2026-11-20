package bank;
import java.math.BigDecimal;

public class Account {

    private final String accountNumber;

    private String ownerName;

    private BigDecimal balance;


    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = BigDecimal.ZERO;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        balance.subtract(amount);
    }
}
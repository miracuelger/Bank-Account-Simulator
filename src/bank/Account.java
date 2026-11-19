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
}
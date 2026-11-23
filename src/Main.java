import bank.Account;
import bank.Transaction;
import bank.TransactionType;

import java.math.BigDecimal;

public class Main {
    static void main(String[] args) {
        clearScreen();
        System.out.println("================");
        System.out.println(" BANKING SYSTEM ");
        System.out.println("================");

        Account myAccount = new Account("AT0001", "Mirac Ülger");
        Account hisAccount = new Account("AT0002", "Alice Werner");
        Transaction transactionToWerner = new Transaction(new BigDecimal("30.00"), "AT0002", TransactionType.TRANSFER);

        myAccount.deposit(new BigDecimal("100.00"));

        System.out.println(myAccount.getBalance());
        System.out.println(transactionToWerner.getTransactionInformation());

    }




    public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
}


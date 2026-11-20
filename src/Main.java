import bank.Account;
import java.math.BigDecimal;

public class Main {
    static void main(String[] args) {
        clearScreen();
        System.out.println("================");
        System.out.println(" BANKING SYSTEM ");
        System.out.println("================");

        Account myAccount = new Account("AT0001", "Mirac Ülger");
        myAccount.deposit(new BigDecimal("99.99"));
        myAccount.withdraw(new BigDecimal("49.99"));
        myAccount.getBalance();
        System.out.println(myAccount.getBalance());
    }




    public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
}


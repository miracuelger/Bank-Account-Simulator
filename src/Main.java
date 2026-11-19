
public class Main {
    static void main(String[] args) {
        clearScreen();
        System.out.println("================");
        System.out.println(" BANKING SYSTEM ");
        System.out.println("================");
    }




    public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
}


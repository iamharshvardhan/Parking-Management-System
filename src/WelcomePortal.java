import java.util.Scanner;

public class WelcomePortal {
    public static Scanner scanner = new Scanner(System.in);

    public static void main() {
        int choice0;
        boolean exit = false;

        System.out.println("Welcome To NOLA parking facility!");
        System.out.println("\t\tMENU");
        System.out.println("Press\n" +
        "1. If You are Checking In." + 
        "\n2. If You are Checking Out." + 
        "\n3. To Exit the Portal.");
        System.out.print("Enter Your Choice: ");
        choice0 = scanner.nextInt();
        scanner.nextLine();

        while (!exit) {
            if (choice0 == 1) {
                CheckIn.main();
                exit = true;
            }
            else if (choice0 == 2) {
                CheckOut.main();
                exit = true;
            }
            else if (choice0 == 3) {
                exit = true;
            }
            else {
                exit = true;   
            }
        }
    }
}

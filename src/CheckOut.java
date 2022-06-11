import java.util.Scanner;

public class CheckOut {
    private static Scanner scanner = new Scanner(System.in);

    public static void main() {
    String receipt;
    boolean exit = false;

    System.out.println("================================");
    System.out.println("Thank you for Using our Facility!" + 
    "\nWould You like a Receipt.");
    System.out.print("Press Y for Yes and N for No: ");
    receipt = scanner.nextLine().toUpperCase();

    while (!exit) {
            if (receipt.equals("Y")) {
                System.out.println("================================");
                System.out.println("\t\tRECEIPT");
                System.out.println("================================");
                System.out.println("Parking Time = 30 minutes" + 
                "\nPayable Amount = 100/-");
                System.out.println("Thank you For using NOLA Parking Facility.");
                System.out.println("================================");
                exit = true;
            }
            else if (receipt.equals("N")) {
                System.out.println("================================");
                System.out.println("Thank you For using NOLA Parking Facility.");
                System.out.println("================================");
                exit = true;
            }    
        }
    }
}

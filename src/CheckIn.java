import java.util.Scanner;

public class CheckIn {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main() {
        System.out.println("================================");
        System.out.println("\nPress");
        System.out.println("1. For 2-Wheeler Parking Spot." + 
        "\n2. For 4-Wheeler Parking Spot." + 
        "\n3. For Trucks and Pick-Ups Parking Spot." + 
        "\n4. End The Program.");
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter Your Choice: ");
            int choice1 = scanner.nextInt();
            scanner.nextLine();

            switch(choice1) {
                case 1:
                    System.out.println("================================");
                    System.out.println("We have a Slot for you on Ground Floor.");
                    Parking.main();
                    exit = true;
                    break;
                case 2:
                    System.out.println("================================");
                    System.out.println("We have a Slot for you on 1st Floor.");
                    Parking.main();
                    exit = true;
                    break;
                case 3:
                    System.out.println("================================");
                    System.out.println("We have a Slot for you on 2nd Floor.");
                    Parking.main();
                    exit = true;
                    break;
                case 4:
                    System.out.println("================================");
                    System.out.println("Thank you for your Time.");
                    exit = true;
            }
        }    
    }
}

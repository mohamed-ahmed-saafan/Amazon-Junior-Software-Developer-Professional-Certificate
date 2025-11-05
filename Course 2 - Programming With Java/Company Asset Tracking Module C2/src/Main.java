import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome To IQ Stores ");

        while (true) {
            System.out.println("\nEnter The Type Of Asset You want: ");
            System.out.println("1) Vehicle");
            System.out.println("2) Computer");
            System.out.println("3) Furniture");
            System.out.println("4) Exit");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    handleVehicleRegistration(in);
                    break;
                case 2:
                    handleComputerRegistration(in);
                    break;
                case 3:
                    handleFurnitureRegistration(in);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using IQ Stores!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleVehicleRegistration(Scanner in) {
        System.out.println("Select a Vehicle Model:");
        System.out.println("1) Citroen C5 Across 2021");
        System.out.println("2) Kia Carens 2010");

        int choice = in.nextInt();
        VehicleAsset vehicle;

        if (choice == 1) {
            vehicle = new VehicleAsset("18105262", "Citroen", 520000, 2021,
                    "Cross Over", 1.6, 150, "Turbo", "225", "18", 60000);
        } else if (choice == 2) {
            vehicle = new VehicleAsset("19105302", "KIA", 120000, 2010,
                    "SUV", 1.6, 110, "NA", "225", "16", 120000);
        } else {
            System.out.println("Invalid vehicle choice.");
            return;
        }

        vehicle.getDetails();
        System.out.println("Current value for the car = " + vehicle.currentValue());
        System.out.println("Before we finalize the purchase, you must perform scheduled maintenance:");
        vehicle.performMaintenance();
    }

    private static void handleComputerRegistration(Scanner in) {
        System.out.println("Feature not implemented yet. Coming soon!");
    }

    private static void handleFurnitureRegistration(Scanner in) {
        System.out.println("Feature not implemented yet. Coming soon!");
    }
}

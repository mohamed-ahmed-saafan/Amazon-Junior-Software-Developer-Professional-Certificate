import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<car> carList = new ArrayList<>();
        ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
        while (true) {
            System.out.println("\nWelcome to the Vehicle Management System!");
            System.out.println("Select an option to continue:");
            System.out.println("1. car");
            System.out.println("2. motorcycle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Car selected");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Car selected");
                        // initialize the brand
                        System.out.println("enter your car's brand : ");
                        String carBrand = in.next();
                        // initialize the car model
                        System.out.println("enter your car's model : ");
                        String carModel = in.next();
                        // initialize car's production year
                        System.out.println("enter your car's year : ");
                        int carYear = in.nextInt();
                        // initialize the number of doors of the car
                        System.out.println("enter the number of doors in your car : ");
                        int numberOfDoors = in.nextInt();
                        // car's object
                        car car = new car(carBrand, carModel, carYear, numberOfDoors);
                        carList.add(car);

                    }
                    System.out.println("printing your cars list");
                    for (car car : carList) {
                        car.printInfo();
                    }
                    break;

                    case "2":
                        System.out.println("Motorcycle selected");
                        for (int i = 0; i < 2; i++) {
                            System.out.println("motorcycle selected number : " + (i+1));
                            // initialize the brand
                            System.out.println("enter your motorcycle's brand : ");
                            String motorcycleBrand = in.next();
                            // initialize the motorcycle model
                            System.out.println("enter your motorcycle's model : ");
                            String motorcycleModel = in.next();
                            // initialize motorcycle's production year
                            System.out.println("enter your motorcycle's year : ");
                            int motorcycleYear = in.nextInt();
                            // initialize the side cart status in the motorcycle
                            System.out.println("does your motorcycle has a side cart (YES/NO) ");
                            in.nextLine();
                            String user = in.next();
                            boolean motorcycleHasASideCart;
                            if(user.equalsIgnoreCase("yes")) motorcycleHasASideCart = true;
                            else motorcycleHasASideCart = false;
                            Motorcycle motorcycle=new Motorcycle(motorcycleBrand,motorcycleModel,motorcycleYear,motorcycleHasASideCart);
                            motorcycleList.add(motorcycle);
                        }
                        System.out.println("printing your motorcycle list");
                        for (Motorcycle motorcycle : motorcycleList) {
                            motorcycle.printInfo();
                        }
                        break;
                        case "3":
                            System.out.println("Thanks for using the vehicle management system!");
                            return;
                            default:
                                System.out.println("Invalid choice");


            }
        }
    }
}
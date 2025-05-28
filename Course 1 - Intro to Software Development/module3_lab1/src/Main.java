import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myFirstCar = new Car();
        myFirstCar.brand = "KIA";
        myFirstCar.model = "Carens";
        myFirstCar.color = " Dark Brown";
        myFirstCar.year = 2011;
        myFirstCar.getCarDetails();
        //array of cars objects
        Car[] cars = new Car[2];
        for (int i = 0; i < cars.length; i++) {
            // car object
            cars[i] = new Car();
            System.out.println("enter your car Brand");
            cars[i].brand = scanner.nextLine();
            System.out.println("enter your car Model");
            cars[i].model = scanner.nextLine();
            System.out.println("enter your car color");
            cars[i].color = scanner.nextLine();
            System.out.println("enter your car Manufacturing year");
            cars[i].year = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("YOUR CAR COLLECTION");
        for (int i = 0; i < cars.length; i++) {
            //String carDetails = cars[i].getCarDetails();
            System.out.println(cars[i]);
        }
    }
}

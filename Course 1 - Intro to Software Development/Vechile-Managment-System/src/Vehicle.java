public class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void printInfo() {
        System.out.println("your vehicle's brand is : " + brand + ", model is : " + model + ", year is : " + year);
    }
}

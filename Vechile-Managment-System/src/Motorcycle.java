public class Motorcycle extends Vehicle {
    boolean hasSideCar;

    public Motorcycle(String brand, String model, int year,boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }
    public void printInfo() {
        super.printInfo();
        if (hasSideCar) {
            System.out.println("your motorcycle has side car");
        }
        else {
            System.out.println("your motorcycle has no side car");
        }
    }
}

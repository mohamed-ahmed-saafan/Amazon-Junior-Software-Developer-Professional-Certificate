public class Car {
    String brand;
    String model;
    String color;
    int year;
    public String getCarDetails() {
        return "brand: " + brand + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}

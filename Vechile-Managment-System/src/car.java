public class car extends Vehicle  {
    int numDoors;

    public car(String brand, String model, int year,int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("the number of doors in your car =  " + numDoors);
    }
}

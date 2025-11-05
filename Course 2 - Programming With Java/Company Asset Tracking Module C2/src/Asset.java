public abstract class Asset {
    String ID;
    String brand;
    double value ;
    int purchaseYear;


    public Asset(String ID, String brand, int value , int purchaseYear) {
        this.ID = ID;
        this.brand = brand;
        this.value = value;
        this.purchaseYear = purchaseYear;
    }
    public abstract void getDetails();
    public abstract double depreciation();
    public double currentValue() {
        return value - depreciation();
    }
}

public class Latte extends Coffee {
    String milkType;
    String SyrupType;
    public Latte(String name, String roast, double price , String milkType, String SyrupType) {
        super(name, roast, price);
        this.milkType = milkType;
        this.SyrupType = SyrupType;
    }
    public void printLatteDetails() {
        System.out.println("your latte has " + milkType + " milk, " +"&" + SyrupType + " Syrup." + "your latte price is " + price );
    }
}

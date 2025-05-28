public class Latte extends Coffee {
    String milkType;
    String SyrupType;
    public Latte(String name, String roast, double price , String milkType, String SyrupType) {
        super(name, roast, price);
        this.milkType = milkType;
        this.SyrupType = SyrupType;
    }
    public void grindBeans() {
        System.out.println("\nGrinding coffee beans coarsely for a latte ( medium grind )");
    }
    public void brewCoffee() {
// TODO 12a: simulate brewing coffee for a latte
        System.out.println("Brewing coffee for a latte...");
// TODO 12b: condition to check if syrupFlavor is selected
        if (SyrupType != null && !SyrupType.isEmpty()) {
// TODO 12c: simulate adding the syrup
            System.out.println("Adding " + SyrupType + " syrup to the cup...");
        }

// TODO 12d: simulate steaming milk
System.out.println("Adding " + milkType + " milk to the cup...");
// TODO 12e: simulate combining coffee and steamed milk
System.out.println("combining " + milkType + "with the coffee");
// TODO 12f: simulate adding a layer of foam on top
        System.out.println("adding a layer of foam ");
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("your latte has " + milkType + " milk, " +"&" + SyrupType + " Syrup." + "your latte price is " + price );
    }
}

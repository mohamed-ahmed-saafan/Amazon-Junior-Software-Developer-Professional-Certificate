import java.util.Scanner;
public class Espresso extends Coffee {
    int numberOfShots;
    Scanner scan = new Scanner(System.in);

    public Espresso(String name, String roast, double price , int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }
    public void grindBeans(){
        System.out.println("Grinding beans of espresso finely");
    }
    public void brewCoffee(){
        System.out.println("Brewing the espresso under high pressure ");
    }
    public void printInfo(){
        super.printInfo();
       double totalPrice =numberOfShots*price;
        System.out.println("you asked for "+numberOfShots+" servings" + "every serving of espresso costs : $"+price + "your total bill = $ "+totalPrice);
    }

}

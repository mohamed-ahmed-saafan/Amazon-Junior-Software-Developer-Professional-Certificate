public class Main {
    public static void main(String[] args) {
        System.out.println("Elephant Animal");
        Enclosure enclosureElephant = new Enclosure("Savannah Zone");
        Elephant elephant=new Elephant("elephant",5,"male",enclosureElephant);
        elephant.makeSound();
        elephant.displayInfo();
        System.out.println("-----------");
        System.out.println("Lion Animal");
        Enclosure enclosurelion=new Enclosure("Africano Park");
        Lion lion=new Lion("lion",9,"male",enclosurelion);
        lion.makeSound();
        lion.displayInfo();
        System.out.println("-----------");
        System.out.println("Parrot Animal");
        Enclosure enclosureparrot = new Enclosure("Red Forest");
        Parrot parrot=new Parrot("parrot",2,"Female",enclosureparrot);
        parrot.makeSound();
        parrot.displayInfo();
        System.out.println("***************");


    }
}

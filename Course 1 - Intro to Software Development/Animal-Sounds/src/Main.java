import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    ArrayList<Animal> animalArrayList = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    String status;
    while (true) {
        System.out.println("do you want to exit ? (y/n)");
        status = in.next();
        if(status.equalsIgnoreCase("y")) {
            System.out.println("exiting program ");
            break;
        }
        // Loop for adding the animals into the list
        for(int i=0;i<4;i++) {
            animalArrayList.clear();
            System.out.print("Enter animal number " + (i+1) + ": ");
            String animalName = in.next();
            switch (animalName.toUpperCase()) {
                case "CAT":
                    animalArrayList.add(new Cat(animalName));
                    break;
                case "DOG" :
                    animalArrayList.add(new Dog(animalName));
                    break;
                case "COW":
                    animalArrayList.add(new Cow(animalName));
                    break;
                    default:
                        System.out.println("Invalid animal name");
            }
        }
        // printing the sound of animal depending on the type of animal
        for(Animal animal : animalArrayList) {
            animal.makeSound();
        }

        }

    }
    }


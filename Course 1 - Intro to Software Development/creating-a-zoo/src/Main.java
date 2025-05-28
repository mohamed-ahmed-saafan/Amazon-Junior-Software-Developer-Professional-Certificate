import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject= new Penguin();
        Animal tigerAnimal = new Tiger();
        Animal dolphinAnimal = new Dolphin();
        Animal penguinAnimal=new Penguin();


        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        /** TODO 1: extend the class Animal to create a new
         *          land based animal named "Tiger" which extends
         *          Animal.
         *          Extra properties of class "Tiger" are:
         *          1. number of stripes
         *          2. speed
         *          3. sound level of roar
         *
         **/

        /** TODO 2: extend the class Animal to create a new
         *          water based animal named "Dolphin" which
         *          extends Animal
         *          Extra properties of class "Dolphin" include:
         *          1. color of dolphin
         *          2. swimming speed
         *
         **/


        /** TODO 3: implemement the "Eat" interface in the
         *          "Tiger" class created in the TODO 1
         *          and also in the
         *          "Dolphin" class created in TODO 2.
         **/



        /** TODO 5: implement the "Walk" interface in
         *          "Tiger" class created in the TODO 1
         *          and in the  implementation of the
         *          "walking" method of the interface
         *          display -
         *          " I am walking at the speed "
         *          and join the value of the variable "speed"
         *
         **/

        /** TODO 6: create a new interface named "Swim"
         *          and declaring a method inside it
         *          named "swimming" with the return type
         *          "void"
         **/

        /** TODO 7: implement the "Swim" interface
         *          in the "Dolphin" class and the
         *          "swimming" method in its implementation
         *          should display the swimming speed as
         *          "Dolphin: I am swimming at the speed ...."
         *          where .... is the value of the variable
         *          "swimmingSpeed"
         **/


        /** TODO 8: create a menu system to work with the Animal selected
         *          use the switch provided below
         **/
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tigerAnimal.getNameOfAnimal());
                        // get menu choice
                        switch (animalDetailsManipulationMenu(keyboard,tigerAnimal)) {
                            case 1:
                                System.out.println("set number of stripes : ");
                               tigerObject.setNumberOfStripes(keyboard.nextInt());
                               System.out.println("set the Tiger speed : ");
                               tigerObject.setSpeed(keyboard.nextInt());
                               System.out.println("set the roar sound level : ");
                               tigerObject.setSoundLevelOfRoar(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println(" number of stripes =  " + tigerObject.getNumberOfStripes());
                                System.out.println(" the Tiger speed =  " + tigerObject.getSpeed());
                                System.out.println(" the roar sound level =  " + tigerObject.getSoundLevelOfRoar());
                                break;
                            case 3:
                                tigerObject.walk();
                                break;
                            case 4:
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguinAnimal.getNameOfAnimal());

                        switch (animalDetailsManipulationMenu(keyboard,penguinAnimal)) {
                            case 1:
                                System.out.println("Age : ");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Weight : ");
                                penguinObject.setWeight(keyboard.nextInt());
                                System.out.println("Height : ");
                                penguinObject.setHeight(keyboard.nextInt());

                                System.out.println("is the penguin walking or swimming?");
                                System.out.println("(1) for swimming // (2) for walking");
                                // if condition to check whether the penguin walking or swimming
                                if(keyboard.nextInt() == 1) {
                                    penguinObject.setSwimming(true);
                                    System.out.println("set the penguin swimming speed : ");
                                    penguinObject.setSwimmingSpeed(keyboard.nextInt());

                                }
                                else {
                                    penguinObject.setSwimming(false);
                                    System.out.println("set the penguin walking speed : ");
                                    penguinObject.setWalkingSpeed(keyboard.nextInt());
                                }
                                break;
                            case 2:
                                if (penguinObject.isSwimming()) {
                                    System.out.println(" swimming speed =  " + penguinObject.getSwimmingSpeed());
                                }
                                else {
                                    System.out.println("walking speed = " + penguinObject.getWalkingSpeed());
                                }
                                break;
                            case 3:
                                if (penguinObject.isSwimming()) {
                                   penguinObject.swim();
                                }
                                else {
                                    penguinObject.walk();
                                }
                                break;
                            case 4:
                                penguinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                    case 2:
                        do {
                            System.out.println("The animal which is chosen is : " + dolphinAnimal.getNameOfAnimal());

                            switch (animalDetailsManipulationMenu(keyboard,dolphinAnimal)) {
                                case 1:
                                    System.out.println("set color : ");
                                    dolphinObject.setColor(keyboard.next());
                                    System.out.println("set the Dolphin speed : ");
                                    dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                    break;
                                case 2:
                                    System.out.println(" color =  " + dolphinObject.getColor());
                                    System.out.println("speed  = " + dolphinObject.getSwimmingSpeed());
                                    break;
                                case 3:
                                    dolphinObject.swim();
                                    break;
                                case 4:
                                    dolphinObject.eatingCompleted();
                                    break;
                                default:
                                    System.out.println("Not supported");

                            }
                            System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                            continueInnerLoop = keyboard.nextInt();
                        } while(continueInnerLoop == 1);
                        break;


                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
        /** TODO 9: create a class "Penguin" from the "Animal" class **/



        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}




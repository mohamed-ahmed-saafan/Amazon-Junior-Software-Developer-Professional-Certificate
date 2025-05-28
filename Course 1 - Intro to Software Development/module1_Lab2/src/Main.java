import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // car variables
        boolean engineStarted ;
        String gear = "p";
        int speed = 0;
        int choice ;
        int acceleration ;
        int brake ;
        String ignition;
        // scanner initialization
        Scanner keyboard = new Scanner(System.in);
        // user entering the engine status(on/off)
        System.out.println("Welcome to Digit engine");
        System.out.println("what's the engine status (on/off)");
        ignition = keyboard.nextLine();

        if (ignition.equalsIgnoreCase("on")) {
            engineStarted = true;
            System.out.println("Engine started");
            while (engineStarted) {
                //displaying the status of the c
                System.out.println("-----car dashboard-----");
                System.out.println("Speed = " + speed + "Km/hr");
                System.out.println("Gear : " + gear);
                // displaying the menu to the user
                System.out.println("-----menu----");
                System.out.println("1- turn off the engine");
                System.out.println("2- change the gear (P,D,N,R)");
                System.out.println("3- Accelerate");
                System.out.println("4- Brake");
                System.out.println("5- Exit");
                //user entering his choice from the menu
                choice = keyboard.nextInt();
                switch (choice) {
                    case 1:
                        engineStarted = false;
                        System.out.println("Engine turned off");
                        break;
                    case 2:
                        // clearing the buffer
                        keyboard.nextLine();
                        // user entering the gear he wants to change to
                        System.out.println("enter the gear (P,D,N,R)");
                        gear = keyboard.nextLine();
                        if(gear.equalsIgnoreCase("p")) {
                            speed =0;
                        }
                        switch (gear) {
                            case "p":
                                System.out.println("gear is changed to P");
                                break;
                            case "d":
                                System.out.println("gear is changed to D");
                                speed=5;
                                break;
                            case "n":
                                System.out.println("gear is changed to N");
                                break;
                            case "r":
                                System.out.println("gear is changed to R");
                                System.out.println("check your surroundings");
                                break;
                            default:
                                System.out.println("Invalid gear");
                        }
                        break;
                    case 3:
                        System.out.println("enter the accelerator paddle displacement in percentage (10 , 50 , 100)");
                        acceleration = keyboard.nextInt();
                        if((gear.equalsIgnoreCase("D")) || (gear.equalsIgnoreCase("N"))) {
                        switch (acceleration) {
                            case 10:
                                System.out.println("accelerator paddle is displaced by 10%");
                                speed += 18;
                                break;
                            case 50:
                                System.out.println("accelerator paddle is displaced by 20%");
                                speed += 40;
                                break;
                            case 100:
                                System.out.println("accelerator paddle is displaced by 100%");
                                speed += 80;
                                break;
                            default:
                                System.out.println("Invalid accelerator value");
                        }

                        }
                        else {
                            System.out.println("Invalid selection the gear is in : " + gear);
                        }
                        break;
                    case 4:
                        System.out.println("enter the brake paddle is displacement (10 , 50 , 100)");
                        brake = keyboard.nextInt();
                        switch (brake) {
                            case 10:
                                System.out.println("brake paddle is displaced by 10%");
                                speed -= 18;
                                break;
                            case 50:
                                System.out.println("brake paddle is displaced by 50%");
                                speed -= 40;
                                break;
                            case 100:
                                System.out.println("brake paddle is displaced by 100%");
                                speed -= 80;
                                break;
                            default:
                                System.out.println("Invalid brake value");
                        }
                        break;
                    case 5:
                        System.exit(0);
                        System.out.println("Exiting digit engine");
                    default:
                        System.out.println("Invalid choice");
                }
            }


        }
        else {
            System.out.println("the engine is off");
        }
    }
}

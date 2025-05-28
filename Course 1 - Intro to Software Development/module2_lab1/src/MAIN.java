import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int daysOfTheWeek =1;
        int subChoice =1;
        int codingLange = 1;
        int videoGame = 1;
        System.out.println("********** MENU *****************\n" +
                "         These are the choices for week of the day. \\n Please enter only values from 1-7:\n" +
                "         1. MONDAY\n" +
                "         2. TUESDAY\n" +
                "         3. WEDNESDAY\n" +
                "         4. THURSDAY\n" +
                "         5. FRIDAY\n" +
                "         6. SATURDAY\n" +
                "         7. SUNDAY\n" +
                "         ***********************************" +
                "");
        System.out.println("enter the day of the week\n");

        daysOfTheWeek = keyboard.nextInt();

        switch (daysOfTheWeek){

            case 1 :
                System.out.println("*********** SUB MENU FOR MONDAY ******\n" +
                        "* 1. Yes, I had my breakfast\n" +
                        "2. No, I would like one\n" +
                        "**************************************" +
                        "");
                System.out.println("enter your choice\n");
                subChoice = keyboard.nextInt();
                if(subChoice == 1) {
                    System.out.println("Today is Monday : go to work and study at home for 1 hour ");
                }
                else if(subChoice == 2){
                    System.out.println("go to second cup and i have some breakfast ");
                }
                else{
                    System.out.println("Please enter a valid number");
                }
                break;
                // toni has a coding assigment due in this day
            case 2 :System.out.println("*********** SUB MENU FOR Tuesday ******\n" +
                    "* 1. C++\n" +
                    "2. JAVA\n" +
                    "**************************************" +
                    "");
            System.out.println("enter your choice\n");
            codingLange = keyboard.nextInt();
            switch (codingLange){

                case 1 :
                System.out.println("go to youtube");
                break;
                case 2 :
                System.out.println("watch module 2 videos");
                break;
                default:
                    System.out.println("Please enter a valid number");
            }
                System.out.println("Today is Tuesday : go to work then and study at home for 2 hours");
                break;
            case 3 :
                System.out.println("Today is Wednesday : go to work then and study at home for 3 hours");
                break;
            case 4 :
                System.out.println("*********** SUB MENU FOR video games ******\n" +
                        "*1. Call of duty BO6\n" +
                         "2. Rocket league \n" +
                         "3. Assassin's creed\n " +
                        "**************************************" +
                        "");
                System.out.println("enter your choice\n");
                videoGame = keyboard.nextInt();
                switch (videoGame){

                    case 1 :
                        System.out.println("play multiplayer to increase your score");
                        break;
                    case 2 :
                        System.out.println("reach diamond level");
                    case 3 :
                        System.out.println("finish chapter 6 ");
                }
                System.out.println("Today is Thursday : go to work then and play video games at 12:30 AM with friends");
                break;
            case 5 :
                System.out.println("Today is Friday : go to pray then spend timme with your family at home");
                break;
            case 6 :
                System.out.println("Today is saturday : go for a walk around the park then watch a movie at home");
                break;
            case 7 :
                System.out.println("Today is Sunday : go to work and study at home for 1 hour");
                break;
            default:
                System.out.println("Please enter a valid number");
        }





    }
}

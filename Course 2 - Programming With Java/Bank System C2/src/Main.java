import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to NBD ");
        System.out.println("Enter your preferred Bank Account ");
        System.out.println("1) Checking Account");
        System.out.println("2) Saving Account");
        System.out.println("3) Exit");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
            UserInfoCheckingAccount();
            break;
            case 2:
                UserInfoSavingAccount();
                break;
                case 3:
                    System.exit(0);
                    break;
                    default:
                        System.out.println("invalid choice");
                        break;
        }

    }
    private static void UserInfoCheckingAccount() {
        System.out.println("enter your name : ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("enter your id : ");
        String id = in.nextLine();
        System.out.println("enter your date of birth : ");
        String dob = in.nextLine();
        System.out.println("enter your E-mail address  : ");
        String email = in.nextLine();
        Client client = null;
        try {
            client = new Client(name, id, dob, email);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            email = in.nextLine();
            client = new Client(name, id, dob, email);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            id = in.nextLine();
            client = new Client(name, id, dob, email);
        }
        BankAccount checkingAccount = new CheckingAccount(13500 , 100 ,client);
        System.out.println("Choose your Action");
        System.out.println("1) deposit");
        System.out.println("2) withdraw");
        int choice = in.nextInt();
        int amount=0;
        switch (choice) {
            case 1:
                System.out.println("enter the amount you want to deposit: : ");
                amount = in.nextInt();
                checkingAccount.deposit(amount);
                break;
            case 2:
                System.out.println("enter the amount you want to withdraw: : ");
                amount = in.nextInt();
                checkingAccount.withdraw(amount);
                break;
                default:
                    System.out.println("invalid choice");
                    break;
        }
        System.out.println(checkingAccount.toString());
    }
    private static void UserInfoSavingAccount() {
        System.out.println("enter your name : ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("enter your id : ");
        String id = in.nextLine();
        System.out.println("enter your date of birth : ");
        String dob = in.nextLine();
        System.out.println("enter your E-mail address  : ");
        String email = in.nextLine();
        Client client = null;
        try {
            client = new Client(name, id, dob, email);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            email = in.nextLine();
            client = new Client(name, id, dob, email);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            id = in.nextLine();
            client = new Client(name, id, dob, email);
        }
        BankAccount savingAccount = new SavingsAccount(13500 , 100 , client , 2);
        System.out.println("Choose your Action");
        System.out.println("1) deposit");
        System.out.println("2) withdraw");
        int choice = in.nextInt();
        int amount=0;
        switch (choice) {
            case 1:
                System.out.println("enter the amount you want to deposit: : ");
                amount = in.nextInt();
                savingAccount.deposit(amount);
                break;
            case 2:
                System.out.println("enter the amount you want to withdraw: : ");
                amount = in.nextInt();
                savingAccount.withdraw(amount);
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
       System.out.println(savingAccount.toString());

    }
}

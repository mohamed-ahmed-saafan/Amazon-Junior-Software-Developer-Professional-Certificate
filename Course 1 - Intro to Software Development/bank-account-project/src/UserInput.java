import java.util.Scanner;
public class UserInput {
    public void welcome(){
        System.out.println("welcome to NBD");
        System.out.println("enter you account information to progress");
    }
    Scanner scanner = new Scanner(System.in);
    public String obtainAccountNumber() {
        System.out.print("Enter account number: ");
       return scanner.nextLine();
    }
    public String obtainName() {
        System.out.println("enter your account name ");
        return scanner.nextLine();
    }
    public double obtainBalance() {
        System.out.println("enter your account balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline
        return balance;
    }
    public String obtainAction() {
        System.out.println("enter your account action:(Deposit or Withdraw) ");
        return scanner.nextLine();
    }
}

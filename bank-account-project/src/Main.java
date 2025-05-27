import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double amount;
        //User input
    Scanner scanner = new Scanner(System.in);
    BankAccount bankAccount = new BankAccount();
    UserInput userInput = new UserInput();
    userInput.welcome();
    bankAccount.accountName=userInput.obtainName();
    bankAccount.accountNumber=userInput.obtainAccountNumber();
    bankAccount.balance=userInput.obtainBalance();
    //Actions
        String action = userInput.obtainAction();
        if (action.equalsIgnoreCase("Deposit")) {
            System.out.println("please enter the amount you want to deposit:");
            amount = scanner.nextDouble();
            bankAccount.deposit(amount);
        }
        else if (action.equalsIgnoreCase("Withdraw")) {
            System.out.println("please enter the amount you want to withdraw:");
            amount = scanner.nextDouble();
            bankAccount.withdraw(amount);
        }
        else {
            System.out.println("please enter a valid action");
        }
    bankAccount.accountInformation();
    }
}

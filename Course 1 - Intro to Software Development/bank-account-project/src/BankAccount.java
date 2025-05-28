public class BankAccount {
    //Attributes
    String accountNumber;
    String accountName;
    double balance;
    public BankAccount(){
        this.balance = 0;
    }
    public BankAccount(String accountNumber, String accountName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        System.out.println("depositing " + amount + " to account " + this.accountNumber);
        this.balance += amount;
        System.out.println("CURRENT BALANCE = " + this.balance);
    }
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("withdrawn amount exceeds balance");
            System.out.println("enter a correct amount");
        }
        else {
            System.out.println("withdrawing " + amount + " to account " + this.accountNumber);
            this.balance -= amount;
            System.out.println("CURRENT BALANCE = " + this.balance);
        }
    }
    public void accountInformation() {
        System.out.println("account information");
        System.out.println("accountNumber = " + this.accountNumber);
        System.out.println("accountName = " + this.accountName);
        System.out.println("balance = " + this.balance);
    }
}

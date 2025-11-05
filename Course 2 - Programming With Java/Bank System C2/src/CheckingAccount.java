public class CheckingAccount extends BankAccount {
    int overDraft;

    public CheckingAccount(int balance, int iScore, Client client) {
        super(balance, iScore, client);
        if(balance < 5000) {
            this.overDraft = 500;
        }
        else {
            this.overDraft = 1000;
        }
    }


    @Override
    public void deposit(int amount) {
        System.out.println("The amount you want to deposit = " + amount);
        balance += amount;
        System.out.println("process completed ");
    }

    @Override
    public void withdraw(int amount) {
        if(balance<amount && (amount - balance) > overDraft ) {
            System.out.println("The amount you want to withdraw Exceeds the overdraft limit");
            System.out.println("Your overdraft amount = " + overDraft);
            System.out.println("Your balance = " + balance + "your must withdraw above your balance by maximum " + overDraft);
        }
            else if (balance<amount && (amount - balance) <= overDraft ) {
                System.out.println("Processing withdraw .....");
                balance -= amount;
                System.out.println("Your balance = " + balance );
                System.out.println("withdraw completed " );
            }
            else {
                System.out.println("Your not eligible for an overdraft amount ");
        }
        }
    @Override
    public String toString() {
        return "Account details" +
                ", Name " + client.name +
                ", date of birth " + client.dob +
                ", email " + client.email +
                ", overDraft=" + overDraft +
                ", balance=" + balance +
                ", iScore=" + iScore +
                ", client=" + client +
                '}';
    }
}

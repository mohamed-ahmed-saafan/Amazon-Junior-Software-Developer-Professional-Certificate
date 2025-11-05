public class SavingsAccount extends BankAccount {
    double interestRate = 0.2;

    public SavingsAccount(int balance, int iScore, Client client, double interestRate) {
        super(balance, iScore, client);
        this.interestRate = interestRate;
    }


    @Override
    public void deposit(int amount) {
        System.out.println("The amount you want to deposit = " + amount);
        balance += amount;
        System.out.println("process completed ");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("The amount you want withdraw = " + amount);
        System.out.println(" WARNING :  the amount will have an interest rate of " + interestRate + "%" + "added to it");
        double loss = amount *interestRate;
        System.out.println("you Payment of " + loss + "is due in 2 days");
        balance -= (int) (loss + amount);
        System.out.println("process completed ");
    }


    @Override
    public String toString() {
        return "Account details" +
                ", Name " + client.name +
                ", date of birth " + client.dob +
                ", email " + client.email +
                ", interest rate " + interestRate +
                ", balance=" + balance +
                ", iScore=" + iScore +
                ", client=" + client +
                '}';
    }
}

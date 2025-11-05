public abstract class BankAccount {
    int balance;
    int iScore;
    Client client;

   public BankAccount( int balance, int iScore, Client client) {
        this.balance = balance;
        this.iScore = iScore;
        this.client = client;
    }
    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);}

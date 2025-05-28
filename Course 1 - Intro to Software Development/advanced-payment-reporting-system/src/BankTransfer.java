import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankTransfer extends AbstractPayment implements PaymentMethod  {
   private String accountNumber;
   private double balance;
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public BankTransfer(double amount, LocalDateTime timestamp) {
        super(amount, timestamp);
    }

    @Override
    public void processPayment(double amount) {
        if(amount>balance) {
            System.out.println("Insufficient balance");
            System.out.println("payment unsuccessful");
        }
        else {
            balance -= amount;
            System.out.println("payment successful");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        if( accountNumber == null || accountNumber.length() != 16 ) {
            throw new IllegalArgumentException("Invalid account number");
        }
        else {
            this.accountNumber = accountNumber;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return "BankTransfer - Account Number: " + accountNumber + ", Amount " + amount +", Balance: " + balance + ", Timestamp: " + timestamp.format(formatter);
    }

    @Override
    void generateReceipt() {
        printCommonReceipt("BANK TRANSFER" , "ACCOUNT NUMBER" ,accountNumber, balance);
    }
}

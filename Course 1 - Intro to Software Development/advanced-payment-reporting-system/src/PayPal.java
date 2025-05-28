import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PayPal extends AbstractPayment implements PaymentMethod {
   private String email;
   private double balance;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public PayPal(double amount, LocalDateTime timestamp) {
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (!email.contains("@") && !email.contains(".com")) {
            System.out.println("Email address is invalid");
        }
        else {
            this.email = email;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public String toString() {
        return "PayPal - Email: " + email + ", Balance: " + balance + ", Amount " + amount + ", Timestamp: " + timestamp.format(formatter);
    }

    @Override
    void generateReceipt() {
        printCommonReceipt("PAYPAL" , "EMAIL" ,email, balance);
    }
}

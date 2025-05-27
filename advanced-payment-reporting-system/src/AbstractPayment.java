import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class AbstractPayment {
    double amount;
    LocalDateTime timestamp;
    protected static  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public AbstractPayment(double amount, LocalDateTime timestamp) {
        this.amount = amount;
        this.timestamp = timestamp;
    }
    abstract void generateReceipt();
    protected void printCommonReceipt(String method, String identifierLabel, String identifier, double balance) {
        System.out.println("Generating receipt...");
        System.out.println("PAYMENT METHOD : " + method);
        System.out.println(identifierLabel + ": " + identifier);
        System.out.println("AMOUNT: " + amount);
        System.out.println("TIMESTAMP: " + timestamp.format(formatter));
        System.out.println("REMAINING BALANCE: " + balance);
    }

}

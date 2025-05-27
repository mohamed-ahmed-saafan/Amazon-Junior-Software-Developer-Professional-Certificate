import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreditCard extends AbstractPayment implements PaymentMethod {
    private String cardNumber;
    private double balance;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public CreditCard(double amount, LocalDateTime timestamp) {
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
            System.out.println("Payment Successful");
        }
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        if(cardNumber == null || cardNumber.length() != 16) {
            throw new IllegalArgumentException("Invalid card number");
        }
        else {
            this.cardNumber = cardNumber;
        }
    }
    public double getBalance() {

        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public String toString() {
        return "CreditCard - Card Number: " + cardNumber +", Amount " + amount + ", Balance: " + balance + ", Timestamp: " + timestamp.format(formatter);
    }
    @Override
    void generateReceipt() {
        printCommonReceipt("CREDIT CARD" , "CARD NUMBER" ,cardNumber, balance);
    }

}

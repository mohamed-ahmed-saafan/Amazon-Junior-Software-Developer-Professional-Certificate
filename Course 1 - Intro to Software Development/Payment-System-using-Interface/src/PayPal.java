public class PayPal implements PaymentMethod {
   private String email;
   private double balance;

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
        return "PayPal - Email: " + email + ", Balance: " + balance;
    }
}

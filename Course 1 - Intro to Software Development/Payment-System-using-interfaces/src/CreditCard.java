public class CreditCard implements PaymentMethod {
    String cardNumber;
    int balance;


    @Override
    public double processPayment(double amount) {
        return 0;
    }
}

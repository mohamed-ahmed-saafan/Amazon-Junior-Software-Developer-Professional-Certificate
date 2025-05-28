import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<PaymentMethod> paymentList = new ArrayList<>();
        int choice;
        int amount = 0;
        float creditBalance = 20000;
        float payPalBalance = 5000;
        float bankTransferBalance = 30000;
        do {
            System.out.println("*** Welcome to the Bank Transfer Page *** ");
            System.out.println("Choose your Payment Method");
            System.out.println("1. CreditCard");
            System.out.println("2. PayPal");
            System.out.println("3. BankTransfer");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:

                    CreditCard creditCard = new CreditCard();
                    creditCard.setBalance(creditBalance);
                    System.out.println("enter your card number  : ");
                    creditCard.setCardNumber(in.next());
                    System.out.println("credit card number " + creditCard.getCardNumber());
                    System.out.println("Balance = " + creditCard.getBalance());
                    System.out.println("enter the amount you want to credit: ");
                    amount = in.nextInt();
                    creditCard.processPayment(amount);
                    System.out.println("your credit card remaining balance is " + creditCard.getBalance());
                    creditBalance= (float) creditCard.getBalance();
                    // output buffer
                    try {
                        // Try to pause the program for 2 seconds
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Something went wrong while processing payment.");
                    }
                    // receipt
                    System.out.println("------Receipt------");
                    System.out.println("credit card number " + creditCard.getCardNumber());
                    System.out.println("Amount = " + amount);
                    System.out.println("Balance = " + creditCard.getBalance());
                    System.out.println(" -------Have a nice day------- ");
                    //Storing the creditCard object in the arraylist with all of it's data
                    paymentList.add(creditCard);
                    System.out.println("your payment was logged");
                    break;

                case 2:
                    PayPal payPal = new PayPal();
                    payPal.setBalance(payPalBalance);
                    System.out.println("enter your PayPal Email : ");
                    payPal.setEmail(in.next());
                    System.out.println("your PayPal balance is " + payPal.getBalance());
                    System.out.println("enter the amount you want to credit: ");
                    amount = in.nextInt();
                    payPal.processPayment(amount);
                    System.out.println("your remaining balance is " + payPal.getBalance());
                    payPalBalance= (float) payPal.getBalance();
                    try {
                        // Try to pause the program for 2 seconds
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Something went wrong while processing payment.");
                    }
                    System.out.println("------Receipt------");
                    System.out.println("PayPal email : " + payPal.getEmail());
                    System.out.println("Amount = " + amount);
                    System.out.println("PayPal balance is = " + payPal.getBalance());
                    System.out.println("------Have a nice day------- ");

                    paymentList.add(payPal);
                    break;

                case 3:
                    BankTransfer bankTransfer = new BankTransfer();
                    bankTransfer.setBalance(bankTransferBalance);
                    System.out.println("enter your Bank Account Number = ");
                    bankTransfer.setAccountNumber(in.next());
                    System.out.println("your Bank account balance is " + bankTransfer.getBalance());
                    System.out.println("enter the amount you want to credit: ");
                    amount = in.nextInt();
                    bankTransfer.processPayment(amount);
                    System.out.println("your credit card balance is " + bankTransfer.getBalance());
                    bankTransferBalance= (float) bankTransfer.getBalance();
                    try {
                        // Try to pause the program for 2 seconds
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Something went wrong while processing payment.");
                    }
                    System.out.println("------Receipt------");
                    System.out.println("Bank Account Number =: " + bankTransfer.getAccountNumber());
                    System.out.println("Amount = " + amount);
                    System.out.println("Bank Account Balance = " + bankTransfer.getBalance());
                    System.out.println("------Have a nice day------- ");
                    paymentList.add(bankTransfer);
                    break;
                    case 4:
                        for (PaymentMethod paymentMethod : paymentList) {
                            System.out.println(paymentMethod);
                        }
                        break;
                    case 5:
                        System.out.println("Exiting Payment Page......");
                        System.exit(0);
                        default:
                            System.out.println("invalid choice");
                            break;
            }
        }while (true);

    }
}

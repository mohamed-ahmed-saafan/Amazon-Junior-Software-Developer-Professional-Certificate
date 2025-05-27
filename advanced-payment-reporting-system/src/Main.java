import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

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
                    System.out.println("enter the amount you want to credit: ");
                    amount = in.nextInt();
                    CreditCard creditCard = new CreditCard(amount,LocalDateTime.now());
                    creditCard.setBalance(creditBalance);
                    System.out.println("enter your card number  : ");
                    creditCard.setCardNumber(in.next());
                    System.out.println("credit card number " + creditCard.getCardNumber());
                    System.out.println("Balance = " + creditCard.getBalance());
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
                    creditCard.generateReceipt();
                    //Storing the creditCard object in the arraylist with all of it's data
                    paymentList.add(creditCard);
                    System.out.println("your payment was logged");
                    break;

                case 2:
                    System.out.println("enter the amount you want to credit: ");
                    amount = in.nextInt();
                    PayPal payPal = new PayPal(amount, LocalDateTime.now());
                    payPal.setBalance(payPalBalance);
                    System.out.println("enter your PayPal Email : ");
                    payPal.setEmail(in.next());
                    System.out.println("your PayPal balance is " + payPal.getBalance());
                    payPal.processPayment(amount);
                    System.out.println("your remaining balance is " + payPal.getBalance());
                    payPalBalance= (float) payPal.getBalance();
                    try {
                        // Try to pause the program for 2 seconds
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Something went wrong while processing payment.");
                    }

                    payPal.generateReceipt();
                    paymentList.add(payPal);
                    break;

                case 3:
                    System.out.println("enter the amount you want to credit: ");
                    amount = in.nextInt();
                    BankTransfer bankTransfer = new BankTransfer(amount,LocalDateTime.now());
                    bankTransfer.setBalance(bankTransferBalance);
                    System.out.println("enter your Bank Account Number = ");
                    bankTransfer.setAccountNumber(in.next());
                    System.out.println("your Bank account balance is " + bankTransfer.getBalance());
                    bankTransfer.processPayment(amount);
                    System.out.println("your credit card balance is " + bankTransfer.getBalance());
                    bankTransferBalance= (float) bankTransfer.getBalance();
                    try {
                        // Try to pause the program for 2 seconds
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Something went wrong while processing payment.");
                    }
                    bankTransfer.generateReceipt();
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

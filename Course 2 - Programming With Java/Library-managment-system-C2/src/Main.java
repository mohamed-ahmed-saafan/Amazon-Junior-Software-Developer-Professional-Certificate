import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Borrower borrower = new Borrower("mohamed" , 18105262);
        Books book1 = new Books("26","Harry potter" , "Fantasy" , 350 ,950 );
        Books book2 = new Books("89","The world of Physics" , "Science" , 200 ,550 );
        borrower.addItems("Harry potter");
        System.out.println("** welcome To The Library Manage System **");
        System.out.println("1- Checkout Item");
        System.out.println("2- Return Item");
        int menu = in.nextInt();
        switch (menu) {
            case 1 : System.out.println("- Enter the Item you want ");
                System.out.println("1) Book ");
                System.out.println("2) Magazine");
                System.out.println("3) DVDS");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        book1.getDetails();
                        System.out.println("Checking the Availability of the Book");
                        book1.checkout(borrower);
                        break;

                }
                break;
                case 2:
                    book2.getDetails();
                    System.out.println("Please Wait....");
                    book2.returnItem(borrower);
                    break;

        }

    }
}
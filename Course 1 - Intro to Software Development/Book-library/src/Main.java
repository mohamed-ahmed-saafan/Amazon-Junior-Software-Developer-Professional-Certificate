
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LibraryClass lib = new LibraryClass();
        BookClass book = new BookClass();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i<=2 ; i++){
            System.out.println("enter book number " + i);
            System.out.println("enter book name :  " );
            book.title = scanner.nextLine();
            System.out.println("enter book author :  " );
            book.author = scanner.nextLine();
            System.out.println("enter isbn  " );
            book.isbn = scanner.nextLine();
            lib.addBook(new BookClass(book.title, book.author, book.isbn));
        }
        System.out.println("enter the isbn number of the book you want " );
        String isbn = scanner.nextLine();
        lib.checkOutBook(isbn);
        System.out.println("enter the isbn number of the book you want to return " );
        String isbnNumber = scanner.nextLine();
        lib.returnBook(isbnNumber);
        lib.listAllBooks();

    }
}

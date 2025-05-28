import java.util.ArrayList;
import java.util.Scanner;
public class LibraryClass {
    ArrayList<BookClass> bookList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    //A default constructor that initializes an empty list of books.
    public LibraryClass() {
        bookList = new ArrayList<>(); // Initializes an empty list
    }

    public void addBook(BookClass book) {
        // adding the book to the arraylist using add method which is a method belongs to the arraylist class
        bookList.add(book);
        System.out.println("book added : " + book.title + " Author : " + book.author + " isbn  : " + book.isbn);
    }
public void checkOutBook(String isbn){
        boolean found = false;
        for (BookClass book : bookList) {
            if (book.isbn.equals(isbn)) {
                found = true;
                if(!book.isAvailable){
                    System.out.println("book has already checked out");
                }
                else {
                    book.checkOut();
                    System.out.println("book : " + book.title+ " is checked out");
                }
                break;
            }


        }
        if(!found){
            System.out.println("book is not found");
        }


}
public String returnBook(String isbn) {
    String name = "";
    for (BookClass book : bookList) {
        if (isbn.equals(book.isbn)) {
            name = book.title;
            System.out.println("book : " + book.title );
            book.checkIn();
            break;
        }
    }
    return name;
}
public void listAllBooks() {
        // printing all books
    System.out.println("books in the library");
    if (bookList.isEmpty()) {
        System.out.println("no books found");
    }

    for (BookClass book : bookList) {
        System.out.println("Title: " + book.title + " | ISBN: " + book.isbn + "book Status : " + book.getStatus() );
    }
}

}

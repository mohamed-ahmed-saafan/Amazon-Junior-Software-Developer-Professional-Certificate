package C3M4L1.library;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class LibraryMenu {
    private Library library;
    private UserInteractionLogger logger = new UserInteractionLogger();
    private LibrarySerializer serializer = new LibrarySerializer();  // Added serializer

    public LibraryMenu(Library library) {
        this.library = library;

        // Load the library data when the program starts
        List<Book> books = serializer.loadLibrary("src/resources/data/library.ser");
        if (books != null) {
            library.setBooks(books);
            System.out.println("Library loaded successfully.");
        } else {
            System.out.println("No saved library found. Loading default books.txt.");
            library.loadBooks("src/resources/data/books.txt");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean state = true;
        while (state) {
            // TODO - missing code
            System.out.println("Welcome to library menu:");
            System.out.println("how can we help you?");
            System.out.println("1- view all books");
            System.out.println("2- Sorting Books by Title");
            System.out.println("3- Sorting Books by Author");
            System.out.println("4- Sorting Books by Year");
            System.out.println("5- searching Book by keyword");
            System.out.println("6- EXIT");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    UserInteractionLogger logger = new UserInteractionLogger();
                    library.viewAllBooks();
                    logger.log("User chose option 1 to view all books");
                    break;
                    case 2:
                        SortUtil sorting = new SortUtil();
                        sorting.bubbleSort(library.getBooks(), Comparator.comparing(Book::getTitle));
                        library.viewAllBooks();
                        break;
                        case 3:
                            SortUtil sorting2 = new SortUtil();
                            sorting2.bubbleSort(library.getBooks(), Comparator.comparing(Book::getAuthor));
                            library.viewAllBooks();
                            break;
                            case 4:
                                SortUtil sorting4 = new SortUtil();
                                sorting4.bubbleSort(library.getBooks(), Comparator.comparing(Book::getPublicationYear));
                                library.viewAllBooks();
                                break;
                                case 5:
                                    scanner.nextLine();
                                    System.out.println("enter the key to search");
                                    String key = scanner.nextLine();
                                   Book returnedBook= library.searchBookByKeyword(key);
                                   if (returnedBook != null) {
                                       System.out.println(returnedBook);
                                   }
                                   else {
                                       System.out.println("Book not found");
                                   }
                                   break;
                                   case 6:
                                       System.out.println("EXITING APPLICATION");
                                       state = false;
                                       break;
                                       default:
                                           System.out.println("Invalid option");
                                           break;
            }

        }
    }

}

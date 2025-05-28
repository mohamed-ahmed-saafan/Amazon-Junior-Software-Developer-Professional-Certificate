import java.awt.print.Book;

public class BookClass {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    public BookClass() {
        this.isAvailable = true;
    }
    public BookClass(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    public void checkOut() {
        isAvailable = false;
    }
    public void checkIn() {
        isAvailable = true;
    }
    public String getStatus() {
        return this.isAvailable ? "Available" : "Checked Out";

    }
}

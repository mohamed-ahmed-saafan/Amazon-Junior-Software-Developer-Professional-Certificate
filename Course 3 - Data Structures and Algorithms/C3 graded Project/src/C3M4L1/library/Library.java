package C3M4L1.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class Library {
    private List<Book> books = new ArrayList<>();

    public void loadBooks(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                //  TODO - missing code
                String[] parts = line.split(",");
                if(parts.length == 3) {
                    String title = parts[0];
                    String author = parts[1];
                    int year = Integer.parseInt(parts[2]);
                    Book bookObject = new Book(title,author,year);
                    books.add(bookObject);
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBookByKeyword(String keyword) {
        // TODO missing code
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                return book;
            }
            if (book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                return book;
            }
            /*if (String.valueOf(book.getPublicationYear()).equals(keyword)) {
                return book;
            }

             */

        }
        return null;
    }


    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}

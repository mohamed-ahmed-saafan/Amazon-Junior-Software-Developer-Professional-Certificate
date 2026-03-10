package C3M4L1.library;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class UserInteractionLogger {

    private static final String LOG_FILE = "src/resources/data/user_interactions.log";

    // Method to log search interactions
    public void logSearch(String searchTerm) {
        log("Search for: " + searchTerm);
    }

    // Method to log sorting interactions
    public void logSort(String sortCriteria) {
        log("Sorted by: " + sortCriteria);
    }

    // Method to log viewing all books.txt
    public void logViewAllBooks() {
        log("Viewed all books.txt");
    }

    // Generic method to log messages with a timestamp
    public void log(String message) {
        // TODO 17: open the log file in append mode
        try (FileWriter writer = new FileWriter("src/resources/data/user_interactions.log", true)) {

            // TODO 18: construct the log entry with timestamp + message
            String logEntry = LocalDateTime.now() + " - " + message + System.lineSeparator();

            writer.write(logEntry);

        } catch (IOException e) {
            // TODO 19: handle exceptions
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }


}

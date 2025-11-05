import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // If you want to keep the file in a particular directory, you can add the path to the file name at the beginning  and append the file extension at the end:
        //"src/" + fileName + ".txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = scanner.nextLine();
        File file = new File("src/" + fileName + ".txt");
        try {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("File has been created");
                System.out.println("File Source is: " + file.getAbsolutePath());
            }
            else
                System.out.println("File could not be created");
        }
        catch (IOException e) {
            System.err.println("I/O Error HAS occurred");
            System.err.println(e.getMessage());
        }

    }
}

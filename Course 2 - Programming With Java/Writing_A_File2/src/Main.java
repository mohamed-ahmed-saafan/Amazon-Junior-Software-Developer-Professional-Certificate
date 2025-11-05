import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/" + fileName + ".txt");
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String fileContents = "Sample description for the file";
            byte[] fileContentsBytes = fileContents.getBytes();






        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
//To create an empty file using the FileOutputStream, you don’t necessarily need to call the write() method. Simply creating a FileOutputStream object will create the file if it does not exist
//Note that if you create a seemingly empty byte array and pass it to the write() method, the method will write null values from the byte array instead. For example, if you pass an empty byte array (e.g. new byte[10]) to the write() method, it will write 10 null (zero-byte) values to the file. In a text editor, the file may look blank, but in a hex editor, you would see 1000 bytes.
/*fileContents

A String that contains the content you want to write to a file.

getBytes()

Converts the String into an array of bytes, where each character is converted into its byte representation.

byte[] fileContentsBytes

Declares a byte array that holds the result of the conversion from String to bytes.
*/
//java.io.File to create and work with files
import java.io.*;
//java.io.FileInputStream to read data

//java.io.FileNotFoundException to handle potential exceptions
public class Main {
    public static void main(String[] args) {
        File file = new File("src/file.txt");
        if (file.exists()) {
            System.out.println("File Absolute Path is : " + file.getAbsolutePath());
        } else
            System.out.println("File Does Not Exists");

        /* try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] fileContentsAsBytes = inputStream.readAllBytes();
            for (int index = 0; index < fileContentsAsBytes.length; index++) {
                //Since the characters are stored as bytes, I must cast each byte to a char to display it correctly
                System.out.print((char) fileContentsAsBytes[index]);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File Does Not Exists");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
         */

        try(BufferedReader inputStream = new BufferedReader(new FileReader(file))){
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
    }

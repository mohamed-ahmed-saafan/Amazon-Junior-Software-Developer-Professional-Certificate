import java.io.*;
import java.util.*;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/employees.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the new File ");
        String fileName = scanner.nextLine();
        scanner.close();
        File file1 = new File("src/"+fileName+".txt");

            try (BufferedReader inputStream = new BufferedReader(new FileReader(file))
            ;BufferedWriter outputStream = new BufferedWriter(new FileWriter(file1)))
            {
                String line;
                while((line = inputStream.readLine()) !=null){
                    System.out.println(line);
                    outputStream.write(line);
                    outputStream.newLine(); //Handles System-specific line break
                }
            }
        catch (FileNotFoundException e)
        {
            System.err.println("File not found ");
            System.out.println(e.getMessage());
        }
         catch (IOException e)
        {
            System.out.println(e.getMessage());

        }
        }
}

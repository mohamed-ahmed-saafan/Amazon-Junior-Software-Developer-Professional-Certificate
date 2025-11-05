import java.io.*;
import java.util.Scanner;

public class Main {
    public Main() throws FileNotFoundException {
    }

    //TODO 3: add a static method here. Use textFileWrite() as name, it won't return any value.
    //Inside the method, declare an object of Person class and use the toString() method to obtain
    //the string representation
    //TODO 4: create object of FileWriter class, it points to file1.txt
    //call the write() method of FileWriter to save the data of the Person object in the file
    //TODO 5: put the file writing code in try block, and catch the IO exception
    public static void textFileWrite(){
        Person person = new Person("mohamed",25 ,95);
        String personData = person.toString();
        try(FileWriter fileWriter = new FileWriter("file1.txt")){
            fileWriter.write(personData);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

//TODO 6: Define printWrite() method, a static method that doesn’t return any data.
//TODO 7: Take inputs from the user with Scanner class, for name, age and weight.
//  Instantiate Person object with the inputs
//TODO 8: Declare object of PrintWriter class, which refers to file2.txt file in the current folder.
//   Call its println() method, to write the object string returned by toString() method
//TODO 9: Put the code in try catch block for IOException
    public static void printWrite(){
        Scanner scanner = new Scanner(System.in);
        String personName;
        int personAge;
        double personWeight;
        System.out.print("Enter your name : ");
        personName = scanner.nextLine();
        System.out.print("Enter your age : ");
        personAge = scanner.nextInt();
        System.out.print("Enter your weight : ");
        personWeight = scanner.nextDouble();
        Person person = new Person(personName,personAge,personWeight);
       String personData= person.toString();
        try(PrintWriter printWriter = new PrintWriter("file2.txt")){
            printWriter.write(personData);
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    //TODO 10: Declare a byte array to store a list of numbers.
//TODO 11: Open a FileOutputStream object, pointing towards file3.txt file
//TODO 12: call the write() method of FileOutputStream object to print each element in the array.
// Use for loop for the purpose
//TODO 13: Place all the file activity inside the try-catch block.

    public static void byteArrayWrite() {
        byte[] numbers = {10, 20, 30, 40, 50};

        try (FileOutputStream fos = new FileOutputStream("file3.txt")) {
            for (byte num : numbers) {
                fos.write(num);
            }
            System.out.println(" Bytes written successfully to file3.txt");
        } catch (IOException e) {
            System.err.println(" Error writing bytes: " + e.getMessage());
        }
    }


//TODO 14: Declare an object of DataOutputStream class.
// Use object of FileOutputStream class as argument to its constructor.
// The FileOutputStream object refers to file4.dat
//TODO 15: Use Scanner class to read name, age, and weight.
// Instantiate a Person object from the inputs.
//TODO 16: Call writeUTF(), writeInt(), and writeDouble() methods of DataOutputStream object
public static void dataOutputWrite() {
    try (FileOutputStream fos = new FileOutputStream("file4.dat");
         DataOutputStream dataOut = new DataOutputStream(fos)) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String personName = scanner.nextLine();
        System.out.println("Enter your age : ");
        int personAge = scanner.nextInt();
        System.out.println("Enter your weight : ");
        double personWeight = scanner.nextDouble();
        Person person = new Person(personName,personAge,personWeight);
        dataOut.writeUTF(person.name);
        dataOut.writeInt(person.age);
        dataOut.writeDouble(person.weightInKG);
    } catch (IOException e) {
        System.err.println("Error writing to file: " + e.getMessage());
    }
}
    public static void main(String[] args) throws Exception{
//TODO 18: call the static methods from main() method
        System.out.println("FileWriter method in the works ");
        textFileWrite();
        System.out.println("FileReader method ends ");
        System.out.println("printWrite method in the works ");
        printWrite();
        System.out.println("printWrite method ends ");
        System.out.println("byteArrayWrite method in the works ");
        byteArrayWrite();
        System.out.println("byteArrayWrite method ends ");
        System.out.println("dataOutputWrite method in the works ");
        dataOutputWrite();
        System.out.println("dataOutputWrite method ends ");
    }
}
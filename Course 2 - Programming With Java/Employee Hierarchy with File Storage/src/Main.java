import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        File inputFile = new File("src/employees.txt");
        File outputFile = new File("src/managers.txt");
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    String name = parts[0].trim();
                    String dep = parts[1].trim();
                    double salary = Double.parseDouble(parts[2].trim());
                    String role = parts[3].trim();

                    Department department = new Department(name);
                    if (role.equalsIgnoreCase("Manager")) {
                        Manager m = new Manager(name, salary, department);
                        employees.add(m);
                        writer.write(m.toString());
                        writer.newLine();
                    } else {
                        employees.add(new Employee(name, salary, department));
                    }
                }catch (NumberFormatException e){
                    System.err.println(e.getMessage());
                }catch (ArrayIndexOutOfBoundsException e){
                    System.err.println(e.getMessage());
                }
            }
            System.out.println("All employees loaded ");
            //Printing arraylist contents instead making a traditional for loop
            employees.forEach(System.out::println);
            System.out.println("Managers loaded to the output file which is : " + outputFile.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

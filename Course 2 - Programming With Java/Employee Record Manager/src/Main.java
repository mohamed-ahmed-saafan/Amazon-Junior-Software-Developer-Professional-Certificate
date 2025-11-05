import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("src/employees.txt");
        File outputFile = new File("src/high_salary_employees.txt");
        List<Employee> employees = new ArrayList<>();
        ///  1) Reading From File
        try (BufferedReader read = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = read.readLine())!= null) {
                try {
                    String[] parts = line.split(",");
                    String name = parts[0].trim();
                    String department = parts[1].trim();
                    /// Double.parseDouble(parts[2].trim()) → Converts salary string to a double.
                    /// If everything works, a new Employee object is created and added to the employees list.
                    double salary = Double.parseDouble(parts[2].trim());
                    employees.add(new Employee(name, department, salary));
                }
                catch (NumberFormatException e) {
                    System.err.println(" invalid salary: " + line);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("missing fields : " + line);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("File Not Found!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        /// 2) display employees
        System.out.println("Employee List :");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        /// 3) Filter & Write high-salary employees
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
            for (Employee employee : employees) {
                if(employee.getSalary()>5000){
                    writer.write(employee.toString());
                    writer.newLine();
                }

            }
            System.out.println("Employee with high salary has been written to file :" + outputFile.getAbsolutePath());

        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    int salary;
    String name;
    String ID;
    // filling the array list with employees
    for (int i = 0; i < 3; i++) {
        System.out.println(" employee number  " + (i + 1) + ": ");
        System.out.print("Enter Employee ID: ");
        ID = in.next();
        System.out.print("Enter Employee Name: ");
        name = in.next();
        System.out.print("Enter Salary: ");
        salary = in.nextInt();
        System.out.print("Enter Employee Position :  ");
        String position = in.next();
        if (position.equalsIgnoreCase("Developer")) {
            employeeArrayList.add(new Developer(ID,name,salary));
        }
        else if (position.equalsIgnoreCase("Manager")) {
            employeeArrayList.add(new Manager(ID,name,salary));
        }
        while (!(position.equalsIgnoreCase("Developer") || position.equalsIgnoreCase("Manager"))) {
            System.out.println("Invalid position! Please enter Developer or Manager:");
            position = in.next();
        }
    }
    // printing the bonuses according to the position
        for (Employee employee : employeeArrayList) {
            employee.Info();
           System.out.println( "Emplyee Bonus = " + employee.getBonus());
        }

    }
}

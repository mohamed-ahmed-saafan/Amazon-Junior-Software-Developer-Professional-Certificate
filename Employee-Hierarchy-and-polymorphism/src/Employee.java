public class Employee {
    // Base Attributes
    String Id;
    String Name;
    int Salary;
    // Parametrized constructor
    public Employee(String id, String name, int salary) {
        this.Id = id;
        this.Name = name;
        this.Salary = salary;
    }
    public int getBonus() {
        return (int) (Salary * 0.1);
    }
    public void Info(){
        System.out.println("Employee Info");
        System.out.println("Id: " + this.Id);
        System.out.println("Name: " + this.Name);
        System.out.println("Salary: " + this.Salary);

    }
}

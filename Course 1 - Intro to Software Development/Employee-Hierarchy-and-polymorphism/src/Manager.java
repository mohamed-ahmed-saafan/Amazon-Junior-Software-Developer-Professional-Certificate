public class Manager extends Employee {
    //parametrized constructor
    public Manager(String Id  , String Name , int salary) {
        super(Id, Name, salary);
    }
    public int getBonus() {
        return (int) (Salary * 0.2);
    }
    public void Info(){
        System.out.println("Position : Manager");
        super.Info();

    }
}

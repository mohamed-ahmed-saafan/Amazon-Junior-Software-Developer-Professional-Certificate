public class Developer extends Employee {
    public Developer(String Id  , String Name , int salary) {
        super(Id, Name, salary);
    }
    public int getBonus() {
        return (int) (Salary * 0.15);
    }
    public void Info(){
        System.out.println("Position : Developer");
        super.Info();

    }
}


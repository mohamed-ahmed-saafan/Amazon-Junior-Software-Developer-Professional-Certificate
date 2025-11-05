public class Manager extends Employee {
    public Manager(String name, double salary, Department department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}

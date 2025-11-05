//TODO 10: make the Employee class implement EmployeeInterface
class Employee extends Person implements EmployeeInterface {
    //TODO 11: declare basicPay as int attribute
    int basicPay;
    Employee(String name, int age, int basic) {
        super(name, age);
        this.name = name;
        this.age=age;
        this.basicPay = basic;
    }
    @Override
    public double computeSalary() {
        double salary = 0;
        //TODO 12: salary calculation logic goes here - basicPay+50 percent of basicPay
        salary = basicPay+(0.5*basicPay);
        return salary;
    }
    @Override
    public double computeTax() {
        double tax=0;
        //TODO 13: tax is 10 percent of basicPay
        tax= basicPay * 0.1;
        return tax;
    }
    @Override
    public void getDetails() {
        //TODO 14: add print statements to print basicPay, salary and tax
        System.out.println("Employee details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Basic Pay : " + basicPay);
        System.out.println("Tax :" + computeTax());
        System.out.println("Salary :" + computeSalary());
    }
}
public abstract class Employee extends Person {
    Date dateOfAppointment;
    int salary;
    public Employee(String name,Date dob ,Date dateOfAppointment) {
        super(name,dob);
        this.dateOfAppointment = dateOfAppointment;
        // Employee is an abstract class and defines salary as an abstract property—meaning each subclass (like Teacher, Clerk, etc.) is expected to define how to handle salary.
    }
    public abstract int getSalary();
    public abstract void setSalary(int salary);
}

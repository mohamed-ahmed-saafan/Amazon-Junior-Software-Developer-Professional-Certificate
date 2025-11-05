public class Teacher extends Employee {
    String Subject;
    String qualification;

   public Teacher(String name, Date dob, String qualification, Date dateOfAppointment, String subject) {
       super(name,dob,dateOfAppointment);
       this.Subject = subject;
       this.qualification = qualification;

   }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    void getDetails() {
        System.out.println("Name of Teacher : " + this.getName());
        System.out.println("Date of Birth : " + this.dob);
        System.out.println("Qualification of Teacher : " + this.qualification);
        System.out.println("Date of Appointment : " + this.dateOfAppointment);
        System.out.println("Subject :" + this.Subject);
        System.out.println("Salary of Teacher : " + this.salary);

    }
}

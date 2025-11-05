public class Student extends Person {
    String Subject;
    Teacher teacher;

    public Student (String name, Date dob, String subject, Teacher teacher) {
        super(name, dob);
        this.teacher=teacher;
        this.Subject = subject;
    }

    @Override
    void getDetails() {
        System.out.println("Name of the Student : " + getName());
        System.out.println("Date of birth : " + this.dob);
        System.out.println("Subject of the Student : " + this.Subject);
        System.out.println("Teacher of the Student : " + this.teacher.getName());

    }
}

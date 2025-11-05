public class Main {
    public static void main(String[] args) {
        Date dobOfStudent =new Date(24,05,2000);
        Date dobOfTeacher =new Date(14,11,2001);
        Date doaOfTeacher =new Date(1,1,2024);
        Teacher teacher = new Teacher("Rahaf",dobOfTeacher,"Engineer",doaOfTeacher,"Physics");
        Student student = new Student("mohamed",dobOfStudent,"Physics",teacher);
        teacher.setSalary(5000);
        student.getDetails();
        teacher.getDetails();



    }
}

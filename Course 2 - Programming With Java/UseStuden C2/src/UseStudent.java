public class UseStudent {

    public static void main(String[] args) {
        try {
            Student s = null;
            printStudent(s);
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        Student[] students = new Student[2];
        Student s1 = new Student("mohamed", 25);
        Student s2 = new Student("rahaf", 24);
        students[0] = s1;
        students[1] = s2;
        listStudents(students);
        thisIsRisky();
    }

    private static void printStudent(Student student) {
        try {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void listStudents(Student[] students) {
        try {
            for (int i = 0; i <= students.length; i++) {
                System.out.println(students[i].getName() + " " + students[i].getAge());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void thisIsRisky() {
        try {
            int priceTag = 50;
            int discount = 0;
            System.out.println("Total = " + (priceTag / discount));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }



}

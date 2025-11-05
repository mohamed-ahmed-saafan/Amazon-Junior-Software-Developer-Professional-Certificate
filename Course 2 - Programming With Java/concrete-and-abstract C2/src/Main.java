import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Subjects
        Subject subject1 = new Subject("Java", 6);
        Subject subject2 = new Subject("Java Online", 4);
        Subject subject3 = new Subject("JavaScript", 6);
        Subject subject4 = new Subject("JavaScript Online", 6);

        // Menu
        System.out.println("Choose a course:");
        System.out.println("1) Java");
        System.out.println("2) Java Online");
        System.out.println("3) JavaScript");
        System.out.println("4) JavaScript Online");

        int choice = in.nextInt();
        in.nextLine(); // Clear buffer

        Course course = null; // Polymorphic variable
        switch (choice) {
            case 1:
                course = new ClassroomCourse(subject1, "Ruben", 9000, "AASTMT", "Spring");
                break;
            case 2:
                course = new OnlineCourse(subject2, "Pierce", 7000, 25, 12);
                break;
            case 3:
                course = new ClassroomCourse(subject3, "Sony Hayes", 12000, "AASTMT", "Fall");
                break;
            case 4:
                course = new OnlineCourse(subject4, "Pierce", 9000, 32, 20);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Create Learner
        Learner learner = new Learner(course);

        System.out.print("Enter your name: ");
        learner.name = in.nextLine();
        if(choice==1 || choice==3)
            System.out.println("Reminder !! : For Classroom courses max assignment = 100, quiz = 30");
        else {
            System.out.println("Reminder: For Online courses max assignment = 30, quiz = 10");
        }

        System.out.print("Enter assignment score: ");
        learner.assigmentScore(in.nextInt());

        System.out.print("Enter quiz score: ");
        learner.quizScore(in.nextInt());

        double grade = learner.calculateGrade();
        System.out.println("\n--- Result ---");
        System.out.println(learner);
        System.out.println("Grade Score: " + grade);

        if (grade >= 5)
            System.out.println(" Student " + learner.name + " has PASSED the course!");
        else
            System.out.println(" Student " + learner.name + " has FAILED the course.");
    }
}

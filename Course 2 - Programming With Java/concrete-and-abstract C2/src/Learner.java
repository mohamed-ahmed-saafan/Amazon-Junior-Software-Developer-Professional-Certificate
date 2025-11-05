//TODO 12: make Learner class implement Assessment interface
public class Learner implements Assessments {
    //TODO 1: declare instance variables
   String name;
   double grade;
   Course course;
   double gradeScore;

    public Learner( Course course) {
        this.course = course;
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }

public double calculateGrade() {
    int maxAssignmentMarks, maxQuizMarks;
    //TODO 17: calculate gradeScore as per the instructions above
    if (this.course.subject.title.contains("Online")) {
        maxAssignmentMarks = 30;
        maxQuizMarks = 10;
    }
    else {
        maxAssignmentMarks = 100;
        maxQuizMarks = 30;
    }
    double assigmentGrade = (double) (this.course.assigmentMarks * 10) / maxAssignmentMarks;
    double quizGrade = (double) (this.course.quizMarks * 10) / maxQuizMarks;
    gradeScore = (assigmentGrade + quizGrade) / 2;
    return this.gradeScore;
}

    @Override
    public void assigmentScore(int score) {
        this.course.assigmentMarks=score;
    }

    @Override
    public void quizScore(int score) {
       this.course.quizMarks=score;
    }
}


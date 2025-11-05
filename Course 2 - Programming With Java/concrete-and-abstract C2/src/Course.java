abstract class Course {
    //TODO 3: include instance variables for Course class and complete constructor code
    Subject subject;
    String Instructor;
    int CourseFee;
    int assigmentMarks;
    int quizMarks;

    public Course(Subject subject, String instructor, int courseFee) {
        this.subject = subject;
        Instructor = instructor;
        CourseFee = courseFee;
    }

}

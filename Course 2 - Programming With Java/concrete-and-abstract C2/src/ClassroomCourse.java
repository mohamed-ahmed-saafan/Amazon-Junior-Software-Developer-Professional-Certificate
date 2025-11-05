class ClassroomCourse extends Course  {
    //TODO 6: add instance variables
    String school;
    String session;

    public ClassroomCourse(Subject subject, String instructor, int courseFee, String school, String session) {
        super(subject, instructor, courseFee);
        this.school = school;
        this.session = session;
    }

    //TODO 7: call superclass constructor


}



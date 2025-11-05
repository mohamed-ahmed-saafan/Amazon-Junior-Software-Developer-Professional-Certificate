class Student extends Person implements StudentInterface {
    //TODO 5: add subject and marks attributes
    String subject;
    double mark;

    Student(String name, int age, String subject, double marks) {
        //TODO 6: complete the constructor code
        super(name, age);
        this.subject = subject;
        this.mark = marks;
    }

    @Override
    void getDetails() {
        //TODO 7: insert print statements for subject and marks attributes
        System.out.println("Student details");
        System.out.println("Name: " + name);
        System.out.println("subject: " + subject);
        System.out.println("Marks: " + mark);

    }

    @Override
    public void result() {
        //TODO 8: print Pass if marks>50, fail otherwise
        if (mark>50){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }

    @Override
    public void fee(int fee) {
        //TODO 9: override fee() method to print the message
        // the student has paid the specified fee as the argument.
        System.out.println("Student payed the Specified Fee which equals to  " + fee + "$");
    }
}
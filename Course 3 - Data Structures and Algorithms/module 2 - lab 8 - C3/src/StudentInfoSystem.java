import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInfoSystem {

    private Database db = new Database();

    /*******************************************************
     *
     *  METHODS THAT NEED IMPROVEMENT
     *
     *******************************************************/

    public List<Subject> sortSubjectsByName() {
        List<Subject> subjectsByName = (List<Subject>) db.subjects.clone();

        /* TODO 6: Implement the bubble sort algorithm to sort the
                   Subject objects by name.*/
        int n = subjectsByName.size();
        for (int counter1 = 0; counter1 < n-1; counter1++) {
            for (int counter2 = 0; counter2 < n-1-counter1; counter2++) {
                if(subjectsByName.get(counter2).name.compareTo(subjectsByName.get(counter2+1).name) > 0) {
                    Collections.swap(subjectsByName, counter2, counter2+1);

                }
            }
        }
        return subjectsByName;
    }

    public List<Student> sortStudentsByName(){
        List<Student> students = (List<Student>) db.students.clone();

        /* TODO 18: Implement the insertion sort algorithm to sort the
                   Student objects by name.*/
        int n = students.size();
        for (int counter1 = 1; counter1 < n; counter1++) {
            String key = students.get(counter1).name;
            int counter2=counter1-1;
            while ((counter2>=0) && (students.get(counter2).name.compareTo(key)>0)){
                Collections.swap(students, counter2+1, counter2);
                counter2--;
            }
        }
        return students;
    }

    public Student findStudent(Integer studentNumber) {

        List<Student> students = this.sortStudentsByNumber();

        /* TODO 28: Replace the linear search for the student with a
                   binary search. */
       /*
        for (Student student : students) {
            if (student.getStudentNumber().equals(studentNumber)) {
                return student;
            }
        }
        */
        int left = 0;
        int right = students.size() - 1;
        int target = studentNumber;
        int flag = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(students.get(mid).studentNumber == target) {
                return students.get(mid);
            }
            if (students.get(mid).studentNumber > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }

        }
        System.out.println("this student is not found");
        return null;
    }

    /*******************************************************
     *
     *  METHODS THAT DO NOT NEED IMPROVEMENT
     *
     *******************************************************/
    public Student findStudent(String name){
        List<Student> students = this.sortStudentsByName();
        int left = 0; // Start at the beginning of the list
        int right = students.size() - 1; // Start at the end of the list
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparitor = students.get(mid).name.compareTo(name);
            if (comparitor == 0){
                return students.get(mid); // its a match!
            }else if (comparitor < 0){
                left = mid + 1; // Ignore the left half and look in the right half
            }else {
                right = mid - 1; // Ignore the right half and look in the left half
            }
        }
        return null; // If we never find the license
    }

    public List<Exam> findExams(String subjectId){
        List<Exam> sortedExams = this.sortExamsBySubjectId();
        ArrayList<Exam> foundExams = new ArrayList<>();
        for (Exam exam : sortedExams) {
            if (exam.getSubjectId().equals(subjectId)){
                foundExams.add(exam);
                if(foundExams.size() == 2){
                    break;
                }
            }
        }
        return foundExams;
    }

    public Exam findExam(int examId, List<Exam> inExams) {
        for (Exam exam : inExams) {
            if (exam.examId == examId) {
                return exam;
            }
        }
        return null;
    }

    /* Implement using linear search */
    public Subject findSubject(String subjectId){
        List<Subject> subjects = this.sortSubjectsById();
        for (Subject subject : subjects) {
            if(subject.id.equals(subjectId)){
                return subject;
            }
        }
        return null;

    }
    public List<Student> sortStudentsByNumber() {
        List<Student> studentsById =
                (List<Student>) db.students.clone();
        return studentsById;
    }

    public List<Subject> sortSubjectsById(){
        List<Subject> subjectsById =
                (List<Subject>) db.subjects.clone();
        return subjectsById;
    }
    public List<Exam> sortExamsBySubjectId(){
        List<Exam> examsToSort = (List<Exam>) db.exams.clone();
        int regCount = examsToSort.size();
        for (int unsorted_Indx = 1; unsorted_Indx < regCount; unsorted_Indx++) {
            Exam unsortedReg =
                    (Exam)examsToSort.get(unsorted_Indx);
            int sorted_Indx = unsorted_Indx - 1;
            while (sorted_Indx >= 0) {
                Exam sortedReg =
                        (Exam)examsToSort.get(sorted_Indx);
                if (sortedReg.subjectId.compareTo(unsortedReg.subjectId) > 0) {
                    examsToSort.set(sorted_Indx + 1, sortedReg);
                    sorted_Indx--; // Move to the next element to the left
                } else {
                    break;
                }
            }
            examsToSort.set(sorted_Indx + 1, unsortedReg);
        }
        return examsToSort;
    }
    public void addStudent(Student student) {
        db.students.add(student);
    }
    public void removeStudent(Student student) {
        db.students.remove(student);
    }
    public int newStudentNumber() {
        List<Student> students = this.sortStudentsByNumber();
        Student lastStudent = students.get(students.size() - 1);
        int lastId = lastStudent.getStudentNumber();
        return lastId++;
    }
    public static void main(String [] args){
        StudentInfoSystem studentInfoSystem = new StudentInfoSystem();

        /* TODO 8: Uncomment the SORT SUBJECTS BY NAME code block */
        /**********************************************************
         System.out.println("\n\nSORT SUBJECTS BY NAME\n");
         List<Subject> subjects = studentInfoSystem.sortSubjectsByName();
         for (Subject subject : subjects) {
         System.out.println(subject);
         }
         ************************************************************/

        /* TODO 20: Uncomment the SORT STUDENTS BY NAME code block. */
        /**********************************************************
         System.out.println("\n\nSORT STUDENTS BY NAME\n");
         List<Student> students = studentInfoSystem.sortStudentsByName();
         for (Student student : students) {
         System.out.println(student);
         }
         /************************************************************/

    }
}

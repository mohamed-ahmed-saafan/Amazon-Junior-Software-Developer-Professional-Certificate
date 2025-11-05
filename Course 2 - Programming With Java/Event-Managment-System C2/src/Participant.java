// Supporting Class
public class Participant {
    String name;
    String gender;
    int age;
    String email;
    int feedbackScore;

    public Participant(String name, String gender, int age, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

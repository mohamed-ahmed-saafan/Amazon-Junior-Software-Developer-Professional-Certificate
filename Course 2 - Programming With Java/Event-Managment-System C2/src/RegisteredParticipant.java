import java.util.ArrayList;
public class RegisteredParticipant extends Participant implements Feedback {
    private ArrayList<Integer> feedbackScores = new ArrayList<>();

    public RegisteredParticipant(String name, String gender, int age, String email) {
        super(name, gender, age, email);
    }

    @Override
    public void giveFeedback(int score) {
        feedbackScores.add(score);
    }

    @Override
    public double calculateAverageScore() {
        if (feedbackScores.isEmpty()) {
            return 0.0;
        }
        int totalScore = 0;
        for(int score : feedbackScores) {
            totalScore += score;
        }

        return (double)totalScore / feedbackScores.size();
    }
}

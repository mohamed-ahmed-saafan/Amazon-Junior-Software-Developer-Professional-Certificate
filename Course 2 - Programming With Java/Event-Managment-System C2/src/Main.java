import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int onlineCount = 0;
        int inPersonCount = 0;
        final int ONLINE_LIMIT = 2;
        final int INPERSON_LIMIT = 2;
        String name;
        int age;
        String gender;
        String email;
        int feedback;
        while (true) {
            System.out.println("Welcome to TechFest 2025!");
            System.out.println("Available Events:");
            System.out.println("1) AI & Ethics - Online Event");
            System.out.println("2) Python Bootcamp - In-Person Event");
            System.out.println("3) Exit");
            System.out.println("enter your choice");
            int choice = in.nextInt();
            System.out.println("Enter your name : ");
            in.nextLine();
            name = in.nextLine();
            System.out.println("Enter your age : ");
            age = in.nextInt();
            in.nextLine();
            System.out.println("Enter your gender : ");
            gender = in.nextLine();
            System.out.println("Enter your email : ");
            email = in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Registering For : AI & Ethics");



                    if (onlineCount >= ONLINE_LIMIT)
                    {
                            System.out.println("The Maximum number of participants has been reached");
                    }
                    else
                    {
                        onlineCount++;
                        Participant participant = new Participant(name, gender, age, email);
                        Event online = new OnlineEvent("AI & Ethics", "Toto Wolf ", 500, 2, participant, "Microsoft Teams", 5);
                        online.eventDetails();
                        online.registerParticipant(participant);
                        RegisteredParticipant registeredParticipant = new RegisteredParticipant(name, gender, age, email);
                        System.out.println("enter your Feedback Score of the 1st part of the event  (0-10)");
                        feedback = in.nextInt();
                        registeredParticipant.giveFeedback(feedback);
                        System.out.println("enter your Feedback Score for the 2nd part of the Event  (0-10)");
                        feedback=in.nextInt();
                        registeredParticipant.giveFeedback(feedback);
                        System.out.println("Your Average Feedback Score for the Event = " + registeredParticipant.calculateAverageScore());
                    }
                    break;

                case 2:
                    System.out.println("Registering For : Python Bootcamp");




                    if (inPersonCount >= INPERSON_LIMIT)
                    {
                        System.out.println("The Maximum number of participants has been reached");
                    }
                    else
                    {
                        Participant participant1 = new Participant(name, gender, age, email);
                        inPersonCount++;
                        Event inperson = new InPersonEvent("Python Bootcamp", "Thomas Hornier ", 1500, 2, participant1, "Ciro Stadium", 5);
                        inperson.eventDetails();
                        inperson.registerParticipant(participant1);
                        RegisteredParticipant registeredParticipant = new RegisteredParticipant(name, gender, age, email);
                        System.out.println("enter your Feedback Score of the 1st part of the event  (0-10)");
                         feedback = in.nextInt();
                        registeredParticipant.giveFeedback(feedback);
                        System.out.println("enter your Feedback Score for the 2nd part of the Event  (0-10)");
                        feedback=in.nextInt();
                        registeredParticipant.giveFeedback(feedback);
                        System.out.println("Your Average Feedback Score for the Event = " + registeredParticipant.calculateAverageScore());
                    }
                    break;

                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }
}
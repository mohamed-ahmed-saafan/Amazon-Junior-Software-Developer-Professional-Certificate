public class OnlineEvent extends Event {
    String platformName;
    int numberOfSessions;

        public OnlineEvent(String eventTitle, String organizerName, int fee, int participantLimit, Participant participant, String platformName, int numberOfSessions)
        {
        super(eventTitle, organizerName, fee, participantLimit, participant);
        this.platformName = platformName;
        this.numberOfSessions = numberOfSessions;
        }

    @Override
    void eventDetails()
    {
        System.out.println("Online Event Details ");
        System.out.println("Event : " + eventTitle);
        System.out.println("Organizer Name : " + organizerName);
        System.out.println("Fee : " + fee);
        System.out.println("Participant Limit : " + participantLimit);
        System.out.println("Platform Name  : " + platformName);
        System.out.println("Number of Sessions : " + numberOfSessions);
    }

    @Override
    void registerParticipant(Participant participant) {
        System.out.println("Registering Participant ");
        System.out.println("Registering Completed for Participant : ");
        System.out.println(participant);
    }
}

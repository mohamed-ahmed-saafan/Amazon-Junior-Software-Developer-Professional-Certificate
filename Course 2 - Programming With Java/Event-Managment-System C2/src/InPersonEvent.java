public class InPersonEvent extends Event {
    String venue;
    int duration;

    public InPersonEvent(String eventTitle, String organizerName, int fee, int participantLimit, Participant participant, String venue, int duration) {
        super(eventTitle, organizerName, fee, participantLimit, participant);
        this.venue = venue;
        this.duration = duration;
    }

    @Override
    void eventDetails() {
        System.out.println("In Person Event Details ");
        System.out.println("Event : " + eventTitle);
        System.out.println("Organizer Name : " + organizerName);
        System.out.println("Fee : " + fee);
        System.out.println("Participant Limit : " + participantLimit);
        System.out.println("Venue: " + venue);
        System.out.println("Duration: " + duration);
    }

    @Override
    void registerParticipant(Participant participant) {
        System.out.println("Registering Participant ");
        System.out.println("Registering Completed for Participant : ");
        System.out.println(participant);
    }
}

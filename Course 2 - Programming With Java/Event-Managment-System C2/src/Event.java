public abstract class Event {
    String eventTitle;
    String organizerName;
    int fee;
    int participantLimit;
    Participant participant;

    public Event(String eventTitle, String organizerName, int fee, int participantLimit , Participant participant) {
        this.eventTitle = eventTitle;
        this.organizerName = organizerName;
        this.fee = fee;
        this.participantLimit = participantLimit;
        this.participant = participant;
    }
   abstract void eventDetails();
    abstract void registerParticipant(Participant participant);
}

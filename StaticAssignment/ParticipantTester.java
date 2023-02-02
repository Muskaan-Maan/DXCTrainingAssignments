
class Participant{

    private static int counter;
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;

    static {
        counter = 10000;
    }
    public Participant(String name, long contactNumber, String city) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
    }

    public String getRegistrationId() {

        registrationId = "D" + getCounter();
        return registrationId;
    }

    public static int getCounter() {
        return ++counter;
    }

    public static void setCounter(int counter) {
        Participant.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class ParticipantTester {

    public static void main(String[] args) {
        Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
        Participant participant2 = new Participant("Marina", 7890423112L, "New York");
        Participant participant3 = new Participant("Daniel", 7890426112L, "San Francisco");
        Participant participant4 = new Participant("Anne", 7890423812L, "Florida");

        Participant[] participants = { participant1, participant2, participant3, participant4 };
        for (Participant participant : participants) {
            System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
        }
    }
}

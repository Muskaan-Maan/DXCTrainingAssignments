abstract public class RRTechnicalCertification implements Certification{

    String studentName;
    String courseName;
    int registrationId;
    int admissionTestMarks;
    //int counter;
    public static int counter1;
    public static int counter2;


    static {
        counter1 = 1001;
        counter2 = 1002;
    }

    public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.admissionTestMarks = admissionTestMarks;

    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getRegistrationId() {

        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public int getAdmissionTestMarks() {
        return admissionTestMarks;
    }

    public void setAdmissionTestMarks(int admissionTestMarks) {
        this.admissionTestMarks = admissionTestMarks;
    }

    abstract public void generateRegistrationId();

    abstract public double calculateFee();


}

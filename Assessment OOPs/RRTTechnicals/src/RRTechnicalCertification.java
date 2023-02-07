public class RRTechnicalCertification implements Certification{

    String studentName;
    String courseName;
    int registrationId;
    int admissionTestMarks;
    int counter;


    public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.counter = 1001;
        this.admissionTestMarks = admissionTestMarks;
        generateRegistrationId();
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

    public void generateRegistrationId(){
        registrationId = counter;
        counter += 2;
    }

    public double calculateFee(){

        return 0;
    }
}

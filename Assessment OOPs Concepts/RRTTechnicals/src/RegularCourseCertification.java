public class RegularCourseCertification extends RRTechnicalCertification implements Certification{

    int courseDuration;

    public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
        super(studentName, courseName, admissionTestMarks);
        this.courseDuration = courseDuration;
        generateRegistrationId();
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void generateRegistrationId(){

        registrationId = counter1;
        counter1 += 2;
    }

    public double calculateFee(){

        double fees = courseDuration * REGULAR_COURSE_FEE;
        double discount = 0;

        if (admissionTestMarks >= 90) {

            discount = 0.10;

        } else if (admissionTestMarks >= 75) {

            discount = 0.05;

        }

        fees = fees - (fees * discount);

        return fees;
    }
}

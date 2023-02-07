public class CrashCourseCertification extends RRTechnicalCertification implements Certification{

    int courseDuration = 2;
    public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
        super(studentName, courseName, admissionTestMarks);
    }

    public void generateRegistrationId(){

        registrationId = counter + 1;
        counter += 2;

    }

    public double calculateFee(){

        double serviceTax = 0.1236;

        double discount = 0;

        double fees = CRASH_COURSE_FEE;

        if (admissionTestMarks >= 90) {

            discount = 0.10;

        } else if (admissionTestMarks >= 75) {

            discount = 0.05;
        }

        fees = fees - (fees * discount);

        fees += fees * serviceTax;

        return fees;
    }
}

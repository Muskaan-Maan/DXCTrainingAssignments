public class Tester {

    public static void main(String[] args){

        RegularCourseCertification rC = new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
        System.out.println("Student Name: " + rC.studentName);
        System.out.println("Course Name: " + rC.courseName);
        System.out.println("Registration Id: " + rC.registrationId);
        System.out.println("Course Duration: " + rC.courseDuration + " months");
        System.out.println("Total Fee: " + rC.calculateFee());

        CrashCourseCertification cC = new CrashCourseCertification("Roshan", "Angular", 71);
        System.out.println("Student Name: " + cC.studentName);
        System.out.println("Course Name: " + cC.courseName);
        System.out.println("Registration Id: " + cC.registrationId);
        System.out.println("Course Duration: " + cC.courseDuration + " months");
        System.out.println("Total Fee: " + cC.calculateFee());
    }
}

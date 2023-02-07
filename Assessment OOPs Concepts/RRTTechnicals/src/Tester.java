public class Tester {

    public static void main(String[] args){

        System.out.println("Regular Course Registration Details");
        RegularCourseCertification rC = new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
        System.out.println("Student Name: " + rC.studentName);
        System.out.println("Course Name: " + rC.courseName);
        System.out.println("Registration Id: " + rC.registrationId);
        System.out.println("Course Duration: " + rC.courseDuration + " months");
        System.out.println("Total Fee: " + rC.calculateFee());

        RegularCourseCertification rC1 = new RegularCourseCertification("Shaurya", "Python", 80, 6);
        System.out.println("Student Name: " + rC1.studentName);
        System.out.println("Course Name: " + rC1.courseName);
        System.out.println("Registration Id: " + rC1.registrationId);
        System.out.println("Course Duration: " + rC1.courseDuration + " months");
        System.out.println("Total Fee: " + rC1.calculateFee());

        System.out.println("Crash Course Registration Details");
        CrashCourseCertification cC = new CrashCourseCertification("Roshan", "Angular", 71);
        System.out.println("Student Name: " + cC.studentName);
        System.out.println("Course Name: " + cC.courseName);
        System.out.println("Registration Id: " + cC.registrationId);
        System.out.println("Course Duration: " + cC.courseDuration + " months");
        System.out.println("Total Fee: " + cC.calculateFee());

        CrashCourseCertification cC1 = new CrashCourseCertification("Rohit", "Databases", 89);
        System.out.println("Student Name: " + cC1.studentName);
        System.out.println("Course Name: " + cC1.courseName);
        System.out.println("Registration Id: " + cC1.registrationId);
        System.out.println("Course Duration: " + cC1.courseDuration + " months");
        System.out.println("Total Fee: " + cC1.calculateFee());
    }
}

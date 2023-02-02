//----------------------------------------------------------------------------------------------------------------------
//--------------------------------------EXCEPTION HANDLING - Exercise 1----------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
class Applicant {
    private String name;
    private String jobProfile;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJobProfile() {
        return jobProfile;
    }
    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class InvalidJobProfileException extends Exception{
    public InvalidJobProfileException(String message){
        super(message);
    }
}

class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}
class Validator{

    public boolean validateName(String name){

        if (name == null || name.equals(""))
        return false;

        else
            return true;
    }

    public boolean validateJobProfile(String jobProfile){

        if (jobProfile.equalsIgnoreCase("Associate") || jobProfile.equalsIgnoreCase("Clerk") || jobProfile.equalsIgnoreCase("Executive") || jobProfile.equalsIgnoreCase("Officer"))
            return true;

        else
            return false;
    }

    public boolean validateAge(int age){

        if (age >= 18 && age <= 30)
            return true;
        else
        return false;
    }

    public void validate(Applicant applicant) throws InvalidNameException, InvalidAgeException, InvalidJobProfileException{

        if(!validateName(applicant.getName())){
            throw new InvalidNameException("Invalid Name");
        }else if(!validateAge(applicant.getAge())){
            throw new InvalidAgeException("Invalid Age");
        }else if(!validateJobProfile(applicant.getJobProfile())){
            throw new InvalidJobProfileException("Invalid Job Profile");
        }
    }
}
class ApplicantTester {
    public static void main(String[] args) {
        try {
            Applicant applicant= new Applicant();
            applicant.setName("John");
            applicant.setJobProfile("Associate");
            applicant.setAge(25);


            Validator validator = new Validator();
            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
        }
        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
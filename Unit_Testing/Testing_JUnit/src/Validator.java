public class Validator {

    public boolean validateName(String name) {

        if (name.length() < 9)
            return false;

        else
            return true;
    }

    public boolean validateAge(int age) {

        if (age >= 18 && age <= 60)
            return true;
        else
            return false;
    }

    public void validate(Employee employee) throws InvalidNameException, InvalidAgeException {

        if (!validateName(employee.getName())) {
            throw new InvalidNameException("Invalid Name");
        } else if (!validateAge(employee.getAge())) {
            throw new InvalidAgeException("Invalid Age");
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}

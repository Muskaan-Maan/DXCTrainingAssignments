public class EmployeeTester {


    public static void main(String[] args) throws InvalidAgeException, InvalidNameException{


        try {
            Employee employee = new Employee("John Travolta", 45000, 45);



            System.out.println("Name of Employee : " + employee.getName());
            System.out.println("Age of Employee : " + employee.getAge());
            System.out.println("Monthly Salary of Employee : " + employee.getMonthlySalary());

            Validator validator = new Validator();
            validator.validate(employee);

            double sal = employee.calculateAnnualSalary();

            System.out.println("Annual Salary of Employee : " + sal);

        }
        catch (InvalidNameException|InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

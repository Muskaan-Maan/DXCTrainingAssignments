public class Employee {

    private String name;
    private double monthlySalary;
    private int age;


    public Employee(String name, double monthlySalary, int age) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public boolean isGreaterThanFour(int number)
    {
        if (number>4)
            return true;
        else return false;
    }

    public double calculateAnnualSalary(){

        double salary = 0;

        if (this.age >= 18 && this.age <= 50) {

            salary = (12 * this.monthlySalary) + (0.06 * this.monthlySalary);
            setMonthlySalary(salary);

        }else if (this.age > 50 && this.age <= 60) {

            salary = (12 * this.monthlySalary) + (0.07 * this.monthlySalary);
            setMonthlySalary(salary);
        }

        return getMonthlySalary();
    }
}

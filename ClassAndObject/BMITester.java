

class BMI{

    String name;
    int age;
    double weight;
    double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this.name = name;
        this.age = 20;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {

        double kiloInPound = 0.4536;
        double metreInInch = 0.0254;
        double bmi = (getWeight() * kiloInPound) / Math.pow(getHeight() * metreInInch, 2);

        return Math.round((bmi * 100) / 100.0);
    }

    public String getStatus() {

        if (getBMI() < 18.5) {
            return "Underweight";
        } else if (getBMI() < 25) {
            return "Normal";
        } else if (getBMI() < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}

public class BMITester {

    public static void main(String[] args){

        BMI bmi1 = new BMI("Kim", 18, 145, 70);

        System.out.println("The BMI for " + bmi1.getName() + " (" + bmi1.getAge() + " yrs) is " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Alex", 155, 60);

        System.out.println("The BMI for " + bmi2.getName() + " (" + bmi2.getAge() + " yrs) is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}

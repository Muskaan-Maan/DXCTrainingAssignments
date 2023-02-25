class Calculator1 {

    private double principal;
    private double time;
    private double rate;

    public Calculator1(double principal, double time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateSimpleInterest(double principal, double time, double rate) {


        double SI = (principal + time + rate) / 100;

        return SI;
    }

    public boolean validate(Calculator1 cal)throws Exception{

        if (cal.getPrincipal() < 0)
            throw new InvalidPrincipalException("Invalid Principal Amount");
        else if (cal.getTime() < 0)
            throw new InvalidTimeException("Invalid Time Period");
        else if (cal.getRate() < 0)
            throw new InvalidRateException("Invalid Interest Rate");

        else
            return true;
    }
}


class InvalidPrincipalException extends Exception {

    public InvalidPrincipalException(String message) {

        super(message);
    }
}

class InvalidRateException extends Exception {

    public InvalidRateException(String message) {

        super(message);
    }
}

class InvalidTimeException extends Exception {

    public InvalidTimeException(String message) {

        super(message);
    }
}

public class Calculator {

    public static void main(String[] args) throws Exception {

        try {
            Calculator1 c = new Calculator1(15000, 5, 4);

            c.validate(c);
            System.out.println(c.calculateSimpleInterest(c.getPrincipal(), c.getTime(), c.getRate()));

        }catch (InvalidPrincipalException | InvalidTimeException | InvalidRateException e){
            System.out.println(e.getMessage());
        }
    }
}
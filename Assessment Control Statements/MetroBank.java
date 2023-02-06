import java.util.*;

class MetroBank1 {

    public void calculateLoan(int accNumber, int sal, int bal, String loanType, int loanAmountExpected, int emi) {

        int loanAmount = 0;
        int bankEmi = 0;

        if (accNumber >= 1000 && accNumber <= 1999) {
            if (bal >= 1000) {

                if (sal > 25000 && loanType.equals("Car")) {

                    loanAmount = 500000;
                    bankEmi = 36;

                    if (emi <= bankEmi && loanAmountExpected <= loanAmount) {
                        System.out.println("Account Number = " + accNumber);
                        System.out.println("Loan Type = " + loanType);
                        System.out.println("Eligible Loan Amount = " + loanAmount);
                        System.out.println("Eligible EMIs = " + bankEmi);
                        System.out.println("Expected Loan Amount = " + loanAmountExpected);
                        System.out.println("Expected EMI = " + emi);
                    } else {
                        System.out.println("Not eligible for loan or EMIs");

                    }
                } else if (sal > 50000 && (loanType.equals("Car") || loanType.equals("House"))) {

                    loanAmount = 6000000;
                    bankEmi = 60;

                    if (emi <= bankEmi && loanAmountExpected <= loanAmount) {
                        System.out.println("Account Number = " + accNumber);
                        System.out.println("Loan Type = " + loanType);
                        System.out.println("Eligible Loan Amount = " + loanAmount);
                        System.out.println("Eligible EMIs = " + bankEmi);
                        System.out.println("Expected Loan Amount = " + loanAmountExpected);
                        System.out.println("Expected EMI = " + emi);
                    } else {
                        System.out.println("Not eligible for loan or EMIs");

                    }
                } else if (sal > 75000 && (loanType.equals("Car") || loanType.equals("House") || loanType.equals("Business"))) {

                    loanAmount = 75000000;
                    bankEmi = 84;

                    if (emi <= bankEmi && loanAmountExpected <= loanAmount) {
                        System.out.println("Account Number = " + accNumber);
                        System.out.println("Loan Type = " + loanType);
                        System.out.println("Eligible Loan Amount = " + loanAmount);
                        System.out.println("Eligible EMIs = " + bankEmi);
                        System.out.println("Expected Loan Amount = " + loanAmountExpected);
                        System.out.println("Expected EMI = " + emi);
                    } else {
                        System.out.println("Not eligible for loan or EMIs");

                    }

                } else {
                    System.out.println("Invalid loan type or salary");
                }

            } else {
                System.out.println("Insufficient Account Balance");
            }
        } else {
            System.out.println("Account Number entered is invalid");
        }

    }

}


public class MetroBank {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        MetroBank1 mB = new MetroBank1();


        System.out.println("Account Number = ");
        int accNum = scn.nextInt();

        System.out.println("Salary = ");
        int salary = scn.nextInt();

        System.out.println("Account Balance = ");
        int accBal = scn.nextInt();

        System.out.println("Loan Type = ");
        String loanType = scn.next();

        System.out.println("Loan Amount expected = ");
        int loanAmt = scn.nextInt();

        System.out.println("Emi expected = ");
        int emiExpected = scn.nextInt();

        mB.calculateLoan(accNum, salary, accBal, loanType, loanAmt, emiExpected);


    }
}

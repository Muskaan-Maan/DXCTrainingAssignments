//----------------------------------------------------------------------------------------------------------------------
//--------------------------------------ABSTRACTION - Assignment 1----------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

abstract class Payment{

    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;

    public Payment(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(double serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }

    abstract public double payBill(double amount);
}
class DebitCardPayment extends Payment{

    private static int counter;
    private double discountPercentage;

    static {
        counter = 1000;
    }
    public DebitCardPayment(int customerId) {
        super(customerId);
        this.paymentId = "D" + getCounter();
    }

    public int getCounter() {
        return counter++;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double payBill(double amount){

        double totalAmt;
        
        if (amount <= 500){
            setServiceTaxPercentage(2.5);
        } else if (amount <= 1000) {
            setServiceTaxPercentage(4);
        }else {
            setServiceTaxPercentage(5);
        }

        if (amount <= 500){
            setDiscountPercentage(1);
        } else if (amount <= 1000) {
            setDiscountPercentage(2);
        }else {
            setDiscountPercentage(3);
        }

        totalAmt = amount + (amount * (getServiceTaxPercentage() / 100.0)) - (amount * (getDiscountPercentage() / 100.0));

        return totalAmt;
    }
}
class CreditCardPayment extends Payment{

    private static int counter;

    static {
        counter = 1000;
    }
    public CreditCardPayment(int customerId) {
        super(customerId);

        this.paymentId = "C" + getCounter();
    }

    public int getCounter() {
        return counter++;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double payBill(double amount){

        double totalAmt;

        if (amount <= 500){
            setServiceTaxPercentage(3);
        } else if (amount <= 1000) {
            setServiceTaxPercentage(5);
        }else {
            setServiceTaxPercentage(6);
        }

        totalAmt = amount + (amount * (getServiceTaxPercentage() / 100.0));

        return totalAmt;
    }
}
class PaymentTester {

    public static void main(String[] args) {

        DebitCardPayment debitCardPayment1 = new DebitCardPayment(101);
        double billAmount1 = Math.round(debitCardPayment1.payBill(900) * 100) / 100.0;
        DebitCardPayment debitCardPayment2 = new DebitCardPayment(102);
        double billAmount2 = Math.round(debitCardPayment2.payBill(500) * 100) / 100.0;
        DebitCardPayment debitCardPayment3 = new DebitCardPayment(103);
        double billAmount3 = Math.round(debitCardPayment3.payBill(800) * 100) / 100.0;

        DebitCardPayment[] debitCardPayments = {debitCardPayment1, debitCardPayment2, debitCardPayment3};
        double[] billAmounts = {billAmount1, billAmount2, billAmount3};

        for (int i = 0; i < debitCardPayments.length; i++) {
            System.out.println("Customer Id: " + debitCardPayments[i].getCustomerId());
            System.out.println("Payment Id: " + debitCardPayments[i].getPaymentId());
            System.out.println("Service tax percentage: " + debitCardPayments[i].getServiceTaxPercentage());
            System.out.println("Discount percentage: " + debitCardPayments[i].getDiscountPercentage());
            System.out.println("Total bill amount: " + billAmounts[i]);

        }


        CreditCardPayment creditCardPayment1 = new CreditCardPayment(102);
        double billAmount4 = Math.round(creditCardPayment1.payBill(1000) * 100) / 100.0;
        CreditCardPayment creditCardPayment2 = new CreditCardPayment(102);
        double billAmount5 = Math.round(creditCardPayment2.payBill(1040) * 100) / 100.0;
        CreditCardPayment creditCardPayment3 = new CreditCardPayment(102);
        double billAmount6 = Math.round(creditCardPayment3.payBill(2000) * 100) / 100.0;

        CreditCardPayment[] creditCardPayments = {creditCardPayment1, creditCardPayment2, creditCardPayment3};
        double[] billAmounts1 = {billAmount4, billAmount5, billAmount6};

        for (int i = 0; i < creditCardPayments.length; i++) {

            System.out.println("Customer Id: " + creditCardPayments[i].getCustomerId());
            System.out.println("Payment Id: " + creditCardPayments[i].getPaymentId());
            System.out.println("Service tax percentage: " + creditCardPayments[i].getServiceTaxPercentage());
            System.out.println("Total bill amount: " + billAmounts1[i]);
        }
    }
}

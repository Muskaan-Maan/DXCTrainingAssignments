

class Bill{

    private static int counter;
    private String billId;
    private String paymentMode;

    static {
        counter = 9000;
    }
    public Bill(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getBillId() {

        billId = "B" + getCounter();
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public static int getCounter() {

       return ++counter;
    }
}

public class BillTester {

    public static void main(String[] args) {
        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        Bill bill3 = new Bill("GPay");
        Bill bill4 = new Bill("Paytm");


        Bill[] bills = { bill1, bill2, bill3, bill4 };
        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
        }
    }
}

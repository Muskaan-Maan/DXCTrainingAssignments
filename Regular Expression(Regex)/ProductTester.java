class Shipment{
    public boolean checkProductNameValidity(String productName) {

        String regex = "[a-zA-Z]{1,}\\s[a-zA-Z]{1,}(?:\\s[a-zA-Z]{1,})?";

        if (productName.matches(regex))
            return true;
        else
            return false;
    }
    public boolean checkProductIdValidity(String productId) {

        String regex = "\\w{2,20}";

        if (productId.matches(regex))
            return true;
        else
            return false;

    }
    public boolean checkTrackerIdValidity(String trackerId) {

        String regex = "[A-Z]{1}[\\:][A-Z]{4}[\\:][a-z]{3}[\\:][0-9]{2}";

        if (trackerId.matches(regex))
            return true;
        else
            return false;
    }
}


public class ProductTester {

    public static void main(String[] args) {

        Shipment shipment = new Shipment();

        String productName1 = "Digital Camera";
        String productName2 = "Digital";
        String productName3 = "Hand Sanitizer and Dispenser";

        String productId1 = "DC191*";
        String productId2 = "D";
        String productId3 = "DC1911GH";

        String trackerId1 = "DCMDC:cmd:23";
        String trackerId2 = "D:CMDC:cmd:23";
        String trackerId3 = "D:CMDC:cd:23";

        String[] productNames = {productName1, productName2, productName3};
        String[] productIds = {productId1, productId2, productId3};
        String[] trackerIds = {trackerId1, trackerId2, trackerId3};

        for (int i = 0; i < 3; i++) {
            System.out.println("The product name is " + (shipment.checkProductNameValidity(productNames[i]) ? "valid!" : "invalid!"));

            System.out.println("The product Id is " + (shipment.checkProductIdValidity(productIds[i]) ? "valid!" : "invalid!"));

            System.out.println("The tracker Id is " + (shipment.checkTrackerIdValidity(trackerIds[i]) ? "valid!" : "invalid!"));
        }
    }
}
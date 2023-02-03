public class WebAddressTester {

    public static boolean checkWebAddressValidity(String webAddress) {

        String regex = "(http|https)(://)(www.)?[a-zA-Z0-9]+\\.(com|org|net)";

        if (webAddress.matches(regex))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        String webAddress1 = "http://www.company.com";
        String webAddress2 = "https://company.com";
        String webAddress3 = "httpss://www.company.com";
        String webAddress4 = "www.company.com";

        String[] webAddresses = {webAddress1, webAddress2, webAddress3, webAddress4};

        for (String w : webAddresses) {
            System.out.println("The web address is " + (checkWebAddressValidity(w) ? "valid!" : "invalid!"));
        }
    }
}

//----------------------------------------------------------------------------------------------------------------------
//--------------------------------------INTERFACE - Assignment 1----------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

interface Testable{

    boolean testCompatibility();

}
class Mobile {

    private String name;
    private String brand;
    private String operatingSystemName;
    private String operatingSystemVersion;

    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }
}
class SmartPhone extends Mobile implements Testable{

    private final String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    public boolean testCompatibility(){

        if (getOperatingSystemName().equals("Saturn")){
            switch (this.networkGeneration) {
                case "3G":
                    if (getOperatingSystemVersion().equals("1.1") || getOperatingSystemVersion().equals("1.2") || getOperatingSystemVersion().equals("1.3"))
                        return true;
                    break;
                case "4G":
                    if (getOperatingSystemVersion().equals("1.2") || getOperatingSystemVersion().equals("1.3"))
                        return true;
                    break;
                case "5G":
                    if (getOperatingSystemVersion().equals("1.3"))
                        return true;
                    break;
            }


        }else if (getOperatingSystemName().equals("Gara")){
            switch (this.networkGeneration) {
                case "3G":
                    if (getOperatingSystemVersion().equals("EXRT.1") || getOperatingSystemVersion().equals("EXRT.2") || getOperatingSystemVersion().equals("EXRU.1"))
                        return true;
                    break;
                case "4G":
                    if (getOperatingSystemVersion().equals("EXRT.2") || getOperatingSystemVersion().equals("EXRU.1"))
                        return true;
                    break;
                case "5G":
                    if (getOperatingSystemVersion().equals("EXRU.1"))
                        return true;
                    break;
            }

        }

        return false;
    }
}


class PhoneTester {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
        SmartPhone smartPhone2 = new SmartPhone("FriezaA8", "Quasar", "Gara", "EXRT.1", "4G");
        SmartPhone smartPhone3 = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.2", "4G");
        SmartPhone smartPhone4 = new SmartPhone("KrillinM20", "Nebula", "gara", "1.3", "5G");

        SmartPhone[] smartPhones = {smartPhone1, smartPhone2, smartPhone3, smartPhone4};

        for (SmartPhone sP : smartPhones) {
            if (sP.testCompatibility())
                System.out.println("The mobile OS is compatible with the network generation!");
            else
                System.out.println("The mobile OS is not compatible with the network generation!");

        }
    }
}
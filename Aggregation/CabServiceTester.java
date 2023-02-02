
class CabServiceProvider{

    private String cabServiceName;
    private int totalCabs;

    public CabServiceProvider(String cabServiceName, int totalCabs) {
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }

    public double calculateRewardPrice(Driver driver){

        double bonus = 0;

        if (getCabServiceName().equals("Halo")) {
            if (driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5) {
              bonus = 10 * driver.getAverageRating();
            } else if (driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5) {
              bonus = 5 * driver.getAverageRating();
            }
        }else if(getCabServiceName().equals("Aber")){
            if (driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5){
                bonus = 8 * driver.getAverageRating();
            } else if (driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5) {
                bonus = 3 * driver.getAverageRating();
            }
        }
            return Math.round(bonus);

    }

    public String getCabServiceName() {
        return cabServiceName;
    }

    public void setCabServiceName(String cabServiceName) {
        this.cabServiceName = cabServiceName;
    }

    public int getTotalCabs() {
        return totalCabs;
    }

    public void setTotalCabs(int totalCabs) {
        this.totalCabs = totalCabs;
    }
}

class Driver{

    private String driverName;
    private float averageRating;

    public Driver(String driverName, float averageRating) {
        this.driverName = driverName;
        this.averageRating = averageRating;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    /*public String toString(){


        return "";
    }*/
}



public class CabServiceTester {

    public static void main(String[] args){

        CabServiceProvider cab1 = new CabServiceProvider("Halo" , 50);

        Driver d1 = new Driver("Luke", 4.8f);
        Driver d2 = new Driver("Mark", 4.2f);
        Driver d3 = new Driver("David", 3.9f);

        Driver[] d = {d1, d2, d3};

        for (Driver driver: d){

            System.out.println("Driver Name: " + driver.getDriverName());
            double bonus = cab1.calculateRewardPrice(driver);

            if (bonus > 0){
                System.out.println("Bonus: $" + bonus);
            }else {
                System.out.println("Sorry! bonus is not available");
            }
        }
    }
}

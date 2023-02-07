class User{
    int id;
    String username;
    String email;
    double walletBalance;

    public User(int id, String username, String email, double walletBalance) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.walletBalance = walletBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    boolean makePayment(double billAmount){

        double wB = this.walletBalance;

        if (getWalletBalance() >= billAmount){

            wB -= billAmount;
            setWalletBalance(wB);

            return true;
        }else
            return false;
    }
}

class KYCUser extends User{
    int rewardPoints;

    public KYCUser(int id, String username, String email, double walletBalance){
        super(id, username, email, walletBalance);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    boolean makePayment(double billAmount){

        boolean payment = super.makePayment(billAmount);
        if (payment) {
            rewardPoints += billAmount * 0.10;
        }
        return payment;
    }

}

class EPayWallet{

    public static void processPaymentByUser(User user, double billAmount){


        if (user.makePayment(billAmount)){
            System.out.println("Congratulations! " + user.getUsername() + " payment of " + billAmount + " was successful");

        }else {
            System.out.println("Sorry " + user.getUsername() + ", not enough balance to make payment");
        }

        System.out.println("Your wallet balance is " + user.getWalletBalance());

        if (user instanceof KYCUser) {
            System.out.println("You have " + ((KYCUser)user).getRewardPoints() + " reward points");
        }

    }
}

public class Tester {

    public static void main(String[] args)throws Exception{

        User u1 = new User(101, "Jack", "jack@dxc.com", 1000);
        KYCUser k1 = new KYCUser(201, "Jill", "jill@dxc.com", 3000);

            EPayWallet.processPaymentByUser(u1, 700);
            EPayWallet.processPaymentByUser(k1, 1500);
            EPayWallet.processPaymentByUser(k1, 800);
            EPayWallet.processPaymentByUser(k1, 1200);


    }
}

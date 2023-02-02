import java.util.*;

class MovieTickets {

    private int movieId;
    private int noOfSeats;
    private double costPerTicket;


    public MovieTickets(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }
    public double calculateTotalAmount() {

        double amt = 0;
        double tax = 0.02;


        if (getMovieId() == 111) {
            setCostPerTicket(7);
            amt = amt + getCostPerTicket() * getNoOfSeats();
            tax *= amt;
            amt += tax;

            return Math.round(amt);

        } else if (getMovieId() == 112) {
            setCostPerTicket(8);
            amt = amt + getCostPerTicket() * getNoOfSeats();
            tax *= amt;
            amt += tax;

            return Math.round(amt);

        } else if (getMovieId() == 113) {
            setCostPerTicket(8.5);
            amt = amt + getCostPerTicket() * getNoOfSeats();
            tax *= amt;
            amt += tax;


            return Math.round(amt);
        }

        return -1;
    }

    public int getMovieId() {

        return movieId;
    }

    public void setMovieId(int movieId) {

        this.movieId = movieId;
    }

    public int getNoOfSeats() {

        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {

        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {

        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {

        this.costPerTicket = costPerTicket;
    }
}
    public class MovieTicket {


        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);

            System.out.println("Movie ID : ");
            int m = scn.nextInt();

            System.out.println("No of Seats : ");
            int n = scn.nextInt();

            MovieTickets mT = new MovieTickets(m, n);

            mT.setMovieId(m);
            mT.setNoOfSeats(n);


            if (mT.calculateTotalAmount() == -1){
                System.out.println("Sorry! Please enter valid MovieID and Number of Seats");
            }else {
                System.out.println("Total Amount for booking : $" + mT.calculateTotalAmount());
            }
        }
    }


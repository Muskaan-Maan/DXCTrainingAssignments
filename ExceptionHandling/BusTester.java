//----------------------------------------------------------------------------------------------------------------------
//--------------------------------------EXCEPTION HANDLING - Assignment 1----------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

class BusBooking {

    private int bookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;

    public BusBooking(int bookingId, String destination, String tripPackage) {
        this.bookingId = bookingId;
        this.destination = destination;
        this.tripPackage = tripPackage;
        this.totalAmount = 0;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripPackage() {
        return tripPackage;
    }

    public void setTripPackage(String tripPackage) {
        this.tripPackage = tripPackage;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String bookTrip(String couponCode, int noOfMembers){

        try {
            if (!(getDestination().equals("Washington") || getDestination().equals("Philadelphia") || getDestination().equals("Orlando") || getDestination().equals("Boston") || getDestination().equals("Atlanta")))
                throw new InvalidDestinationException("Invalid destination");

            else if (!(getTripPackage().equals("Regular") || getTripPackage().equals("Premium")))
                throw new InvalidTripPackageException("Invalid Trip Package");

            validateCouponCode(couponCode, noOfMembers);


            if (getTripPackage().equals("Regular")) {
                setTotalAmount(500 * noOfMembers);
                return "Booking successful";
            } else if (getTripPackage().equals("Premium")) {
                setTotalAmount(800 * noOfMembers);
                return "Booking successful";
            } else
                throw new InvalidTripPackageException("Invalid Trip Package");
        }
        catch (InvalidDestinationException e){
            return e.getMessage();
        }
        catch (InvalidTripPackageException e){
            return e.getMessage();
        }
        catch (InvalidCouponCodeException e){
            return e.getMessage();
        }
    }


    public boolean validateCouponCode(String couponCode, int noOfMembers)throws InvalidCouponCodeException{

        if (couponCode.equals("BIGBUS")){
            if (noOfMembers >= 10)
                return true;

        } else if (couponCode.equals("MAGICBUS")) {
            if (noOfMembers >= 15)
                return true;
        }

         throw new InvalidCouponCodeException("Invalid Coupon code");

    }


}

    class InvalidCouponCodeException extends Exception{
        public InvalidCouponCodeException(String message){
            super(message);
        }
    }

    class InvalidDestinationException extends Exception{
        public InvalidDestinationException(String message){
            super(message);
        }
    }

    class InvalidTripPackageException extends Exception{
        public InvalidTripPackageException(String message){
            super(message);
        }
    }

class BusTester{
    public static void main(String[] args) throws InvalidTripPackageException, InvalidDestinationException, InvalidCouponCodeException {
        BusBooking booking = new BusBooking(101,"Orlando", "Premium");
        String result = booking.bookTrip("BIGBUS", 10);
        if(result.equals("Booking successful")){
            System.out.println(result);
            System.out.println("Total amount for the trip: " + booking.getTotalAmount());
        }
        else{
            System.out.println(result);
            System.out.println("Your booking was not successful, please try again!");
        }
    }
}
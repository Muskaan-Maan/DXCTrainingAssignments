public class Cricket {

    public static void main(String[] args){

        double priceR = 0;
        double priceC = 0;
        double priceH = 0;
        int countR = 0;
        int countC = 0;
        int countH = 0;

        String[] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};
        int noOfTshirt = cart.length;

        for (String s : cart) {

            switch (s) {
                case "round-neck" -> {
                    priceR = 200;
                    countR++;
                }
                case "collared" -> {
                    priceC = 250;
                    countC++;
                }
                case "hooded" -> {
                    priceH = 300;
                    countH++;
                }
            }
        }


        double pOr = priceR * countR;
        double pOc = priceC * countC;
        double pOh = priceH * countH;

        double total = pOr + pOc + pOh;


        double discount = 0;

        if (noOfTshirt < 5){
            discount = 0;
        } else if (noOfTshirt <= 10) {
            discount = 10;
        }else {
            discount = 20;
        }

        double finalAmount = total - (total * ((discount) / 100));

        System.out.println("Final price is Rs. " + finalAmount);
    }


}

import java.util.*;

public class NumberOfAnimals {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int heads = scn.nextInt();
        int legs = scn.nextInt();

        rabbitsAndChickens(heads, legs);
    }

    public static void rabbitsAndChickens(int h, int l){

        if(l % 2 != 0 || h == 0 || h > l){

            System.out.println("The number of Chickens and Rabbits cannot be found");

        }else{

            int r = (l - 2*h)/2;
            int c = h - r;

            System.out.println("Chickens = " + c);
            System.out.println("Rabbits = " + r);
        }

    }
}

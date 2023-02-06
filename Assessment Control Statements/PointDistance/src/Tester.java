

public class Tester {

    public static void main(String[] args){

        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 6);

        System.out.println("The distance of p1 from the origin is " +p1.distance());
        System.out.println("The distance of p1 from p2 is " +p1.distance(p2));
    }
}

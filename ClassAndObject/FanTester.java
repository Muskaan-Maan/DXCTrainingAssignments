class Fan{

    final static int slow = 1;
    final static int medium = 2;
    final static int fast = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {

        speed = slow;
        on = false;
        radius = 5;
        color = "blue";
    }

    public String toString(){

        String st;

        if (isOn()){
            st = "Fan Speed is " + getSpeed() + ", color is " + getColor() + " and radius is " + getRadius();
        }else {
            st = "Fan color is " + getColor() + ", radius is " + getRadius() + " and Fan is Off";
        }

        return st;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class FanTester {

    public static void main(String[] args){

        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setOn(true);
        f1.setSpeed(3);
        f1.setColor("yellow");
        f1.setRadius(10);

        System.out.println("Fan 1 : " + f1.toString());

        f2.setOn(true);
        f2.setSpeed(2);
        f2.setColor("blue");
        f2.setRadius(5);
        f2.setOn(false);

        System.out.println("Fan 2 : " + f2.toString());

    }
}

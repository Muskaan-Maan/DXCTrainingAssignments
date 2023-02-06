class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){

        double distance = Math.sqrt(((this.x - 0)*(this.x - 0)) + ((this.y - 0)*(this.y - 0)));

        return Math.round(distance * 10000) / 10000.0;
    }

    public double distance(Point point){

        double distance = Math.sqrt(((point.x - x)*(point.x - x)) + ((point.y - y)*(point.y - y)));

        return Math.round(distance * 10000) / 10000.0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

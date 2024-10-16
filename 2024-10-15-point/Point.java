public class Point {
    private double x, y;

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    //Initialize this Point to have the same values as the other Point.
    public Point(Point other) {
        //COMPLETE THIS SECOND
        //Then write test cases.
        x = other.getX();
        y = other.getY();
    }

    //Initialize this Point to have the provided values
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    /*
    Write this method FOURTH, go to the main and do that one first.
    */
    public double distanceTo(Point other) {
        double dx = this.x - other.getX();
        double dy = this.y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    /*
    Write this method last. Re-use (NOT COPY/PASTE) prior work and
    do not write redundant code.
    */
    public static double distance(Point a, Point b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }


}
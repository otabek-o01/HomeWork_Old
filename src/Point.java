public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        y = 0;
        x = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        double distance = Math.sqrt(x*x + y*y);
        return distance;
    }
    public double distance(int x2, int y2) {
        double distantace  = Math.sqrt((x2-x)*(x2-x) + (y2-y)*(y2-y));
        return distantace;
    }
}

public class Point2 {

    private double z;
    private double x;
    private double y;

    public Point2(double z, double x, double y) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    public double getZ() {
        return z;
    }
    public double getY(){
        return y;
    }
    public double getX(){
        return x;
    }

    public void Pointinfo(){
        System.out.println("Point = (  " + x + " + " + y + " + " + z + " ) ");
    }
}
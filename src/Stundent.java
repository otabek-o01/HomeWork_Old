public class Stundent {

    private String name;
    private double Mark1;
    private double Mark2;

    public Stundent(String mark1) {
        name = "";
        Mark1 = 0;
        Mark2 = 0;
    }

    public Stundent(String name,double mark1, double mark2) {
        this.name = name;
        this.Mark1 = mark1;
        this.Mark2 = mark2;
    }
    public double getMarks(int markNumber) {

        if (markNumber== 1) {
            return Mark1;
        }else if (markNumber== 2) {
            return Mark2;
        }
        return 0;
    }

    public double calculateMarks() {
        return Mark1 + Mark2;
    }


}

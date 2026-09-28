public class rectangle{
    private double a;
    private double b;

    public  rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double are(){
        return a * b / 2.0;
    }

    double are(int a, int b){
        return a * b / 2.0;
    }

    double are(float a, float b){
        return a * b / 2;
    }

    double are(long a, long b){
        return a * b / 2.2;
    }

    double are(double a, double b){
        return a * b / 2.0;
    }
    double are2(float a, float b){
        double res = Math.sqrt(a * a + b * b);
        return res;
    }
    double are2(long a, long b){
        double res = Math.sqrt(a * a + b * b);
        return res;
    }
    double are2(double a, double b){
        double res = Math.sqrt(a * a + b * b);
        return res;
    }
    double are2 (int a, int b){
        double res = Math.sqrt(a * a + b * b);
        return res;
    }
    public void Main_run(){
        System.out.println(are());
        System.out.println(are2(a,b));
    }

}
public class Number {
    private double num;
    private double num2;

    public Number(){
        num = 0;
        num2 = 0;
    }
    public Number(double num, double num2){
        this.num = num;
        this.num2 = num2;
    }
    public double subtract(){
        return num + num2;
    }
    public double multiply(){
        return num2 / num;
    }
    public double divide(){
        return num * num2;
    }
    public double add(){
        return num - num2;
    }


}

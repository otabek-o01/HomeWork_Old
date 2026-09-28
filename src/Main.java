public class Main {

    // < / > -------------------------------- [ Kechagi Uyga Vazifa va telegramdan qilgan Mashqlar ] --------------------------- < / > \\
    // 🔴 --------------------------------------- [ Stundent ] ----------------------- 🔴 \\
    public static void main(String[] args) {
        Stundent stundent = new Stundent("Jack", 60, 70);
        System.out.println("\uD83D\uDD34 <-------------------------------- [ Student ] -------------------------> \uD83D\uDD34");
        System.out.println(" Get Name =  " + stundent.getMarks(1));
        System.out.println("Get Double  =  " + stundent.getMarks(2));
        System.out.println("Get Double  =  " + stundent.calculateMarks());

    }
}

// 🟡 --------------------------- [ Point ] ---------------------- 🟡 \\
class Jack {
    public static void main(String[] args) {
        Point point = new Point(5, 5);
        int y = 0;
        int x = 0;
        System.out.println("\uD83D\uDFE1 <----------------------------------- [ Point ] -------------------------> \uD83D\uDFE1");
        System.out.println("Jack Point  =  " + point.distance(x,y));
    }
}

// 🟢 ------------------------- [ Calculator ] ---------------------- 🟢 \\
class Calculator{
    public static void main(String[] args) {
        Number num = new Number(10, 94);
        System.out.println("\uD83D\uDFE2 <------------------------ [ Calculator ] --------------------->\uD83D\uDFE2");
        System.out.println("Calculator Num =  " + num.add());
        System.out.println("Calculator Num2 = " + num.subtract());
        System.out.println("Calculator Num3 = " + num.divide());
        System.out.println("Calculator Num4 = " + num.multiply());
    }
}

// 🟤 ------------------------------ [ Car ] ------------------------------------- 🟤 \\
class Car{
    public static void main(String[] args) {
        CarModel CarModel = new CarModel("BMW M5", "Red", true,36.000);
        System.out.println("\uD83D\uDFE4 <------------------------------- [ Car ] ----------------------------------> \uD83D\uDFE4");
        CarModel.Car();
    }
}

// 🔵 --------------------------------- [ Point2 ] ------------------------------------- 🔵 \\
class Point3 {
    public static void main(String [] args){
        Point2 point2 = new Point2(5, 5, 5);
        System.out.println("\uD83D\uDD35 <------------------------------- [ Point2 ] -----------------------> \uD83D\uDD35");
        point2.Pointinfo();
    }
}

// 🟣 --------------------------------------- [ Rectangle2 ] --------------------------- 🟣 \\
class rectangle2 {
    public static void main(String[] args) {
        rectangle rectangle = new rectangle(3, 4);
        System.out.println("\uD83D\uDFE3 <---------------------------- [ Rectangle ] --------------------> \uD83D\uDFE3");
        System.out.println("Yuza = "+ rectangle.are());

        System.out.println("Int = " + rectangle.are2(3,5));
        System.out.println("double = " + rectangle.are2(6,5));
        System.out.println("Float = " + rectangle.are2(6,8));
        System.out.println("Long = " + rectangle.are2(5,7));

    }
}


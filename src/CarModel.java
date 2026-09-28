public class CarModel {
    /*
    CarModel ------|
                   | -- String
    CarColor ------|
     */
    private String CarModel;
    private String CarColor;

    // CarAuto -- Boolean
    private boolean CarAuto;

    //CarPrice -- Double
    private double CarPrice;

    /**
     * Constructor for the CarModel class.
     * Initializes a new car object with its model, color, transmission type, and price.
     *
     *  CarModel The model of the car (e.g., "Malibu")
     *  CarColor The color of the car (e.g., "Black")
     *  CarAuto  Transmission type: true for automatic, false for manual
     *  CarPrice The price of the car
     */
    public CarModel(String CarModel, String CarColor, boolean CarAuto, double CarPrice){
        this.CarModel = CarModel;
        this.CarColor = CarColor;
        this.CarAuto = CarAuto;
        this.CarPrice = CarPrice;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String CarColor) {
        this.CarColor = CarColor;
    }

    public boolean isCarAuto() {
        return CarAuto;
    }

    public void setCarAuto(boolean CarAuto) {
        this.CarAuto = CarAuto;
    }

    public double getCarPrice() {
        return CarPrice;
    }

    public void setCarPrice(double CarPrice) {
        this.CarPrice = CarPrice;
    }


    public void Car(){
        System.out.println("Car_Model =  " + this.CarModel);
        System.out.println("Car_Color =  " + this.CarColor);
        System.out.println("Car_Price =  " + this.CarPrice + "$");
        if(this.CarAuto == true){
            System.out.println("Car_Auto == True");
            this.CarAuto = false;
        }else {
            System.out.println("Car_Auto == False");
            this.CarAuto = true;
        }
    }


}

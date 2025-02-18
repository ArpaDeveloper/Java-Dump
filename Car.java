package main;

public class Car extends Vehicle{

   // private static Engine engine = new Engine("V8", 300);

    //Constructor
    public Car(String manufacturer, String model, int maxSpeed) {
        super("Car",manufacturer, model, maxSpeed); 
        setEngine(new Engine("V8", 300));
    }

    //Method to drive
    public void drive(){ 
        System.out.println(super.getManufacturer()+" "+super.getModel()+" is driving on the road!");
    }
}

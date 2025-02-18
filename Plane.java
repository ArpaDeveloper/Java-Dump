package main;

public class Plane extends Vehicle{

    //Constructor
    public Plane(String manufacturer, String model, int maxSpeed) {
         super("Plane",manufacturer, model, maxSpeed);
         setEngine(new Engine("Jet engine", 500));
    }

    //Method to drive
    public void fly(){ 
        System.out.println(super.getManufacturer()+" "+super.getModel()+" is flying in the sky!");
    }

}

package main;

public class Ship extends Vehicle{
    
    //Constructor
    public Ship(String manufacturer, String model, int maxSpeed) {
        super("Ship",manufacturer, model, maxSpeed);
        setEngine(new Engine("Wärtsilä Super", 1000));
    }

    //Method to drive
    public void sail(){ 
        System.out.println(super.getManufacturer()+" "+super.getModel()+" is sailing on the sea!");
    }
}

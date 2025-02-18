package main;

//Imports
import java.util.ArrayList;

public abstract class Vehicle {

    //Variables
    private String type;
    private String manufacturer;
    private String model;
    private int maxSpeed;
    private Engine engine;
    //List for vehicles
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    //Constructor
    public Vehicle(String type, String manufacturer, String model, int maxSpeed){
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    //Method to make the vehicle a string
    @Override
    public String toString() {
        return type+": "+manufacturer+" "+model+"\nMax Speed: "+maxSpeed+" km/h"+engine.toString();
    }
   
    //Setters
    public void setEngine(Engine engine){ //I discussed this with Andrei
        this.engine = engine;
    }

    //Getters
    public String getType(){
        return type;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public Engine getEngine(){
        return engine;
    }

}

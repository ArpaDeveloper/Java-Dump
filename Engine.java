package main;

public class Engine {
   
    //Variables
    private String name;
    private int power;

    //Constructor
    public Engine(String name, int power){
        this.name = name;
        this.power = power;
    }

    //Method to get the Engine String
    @Override
    public String toString() {
        return "\nEngine: "+name+" (" +power+" HP) ";
    }

    //Getters
    public String getName(){
        return name;
    }

    public int getPower(){
        return power;
    }

}

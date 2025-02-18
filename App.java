package main;

//Imports
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String menuText = "1) Create new vehicle, 2) List vehicles 3) Drive cars, 4) Fly planes, "
        + "5) Sail the ships, 0) End the program";

        Car car = null;
        Plane plane = null;
        Ship ship = null;
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while (true){

            System.out.println(menuText);
            String choice = sc.nextLine().trim();

            switch(choice){
                case "1": //Create new vehicle
                    System.out.println("Which vehicle do you want to build? 1) car, 2) plane, 3) ship");
                    String type = sc.nextLine().trim();
 
                    if(type.equals("1")){
                        type = "Car";
                    }
                    else if(type.equals("2")){
                        type = "Plane";
                    }
                    else if(type.equals("3")){
                        type = "Ship";
                    }
                    else{ 
                        System.out.println("Invalid vehicle type");
                        break;
                    }
                    
                    System.out.println("Who is the manufacturer?");
                    String manufacturer = sc.nextLine();
                    System.out.println("What is the model of the vehicle?");
                    String model = sc.nextLine();

                    int maxSpeed = -1;
                    while(true){
                        System.out.println("What is the top speed?");
                        try{
                            maxSpeed = Integer.parseInt(sc.nextLine());
                            break;
                        }
                        catch(Exception e){
                            System.out.println("Wrong input value");
                        }
                    }

                    if(type.equals("Car")){
                        car = new Car(manufacturer, model, maxSpeed);
                        vehicles.add(car);
                    }
                    else if(type.equals("Plane")){
                        plane = new Plane(manufacturer, model, maxSpeed);
                        vehicles.add(plane);
                    }
                    else if(type.equals("Ship")){
                        ship = new Ship(manufacturer, model, maxSpeed);
                        vehicles.add(ship);
                    }

                    break;
                
                case "2": //List Vehicles
                    for (Vehicle vehicle : vehicles) {
                       System.out.println(vehicle.toString());
                       System.out.println("");
                    }
                    break;
                
                case "3": //Drive Cars
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Car) {
                            car = (Car) vehicle; 
                            car.drive();
                        }
                    }
                    break;
                
                case "4": //Fly Planes
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Plane) {
                            plane = (Plane) vehicle; 
                            plane.fly();
                        }
                    }
                    break;
                
                case "5": //Sail the Ships
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Ship) {
                            ship = (Ship) vehicle;
                            ship.sail();
                        }
                    }
                    break;

                case "0": //Exit program
                    System.out.println("Thank you for using the program.");
                    sc.close();
                    return;
                
                default: //Handle errors
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}

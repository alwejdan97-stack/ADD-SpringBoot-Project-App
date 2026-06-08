package Services;

import Entities.Employee;
import Entities.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleManager {
    public static Map<Integer, Vehicle> vehicleMap=new HashMap<>();
    public static void main(String[] args){
        vehicleMap.put(101, new Vehicle(101, "Toyota Camry", 45.00));
        vehicleMap.put(202, new Vehicle(202, "Tesla Model 3", 85.50));
        vehicleMap.put(303, new Vehicle(303, "Ford Mustang", 120.00));
        vehicleMap.put(404, new Vehicle(404, "Nissan Sunny", 30.25));
    }

    // method for adding vehicle
    public static void addVehicle(Vehicle newVehicle){
        if(vehicleMap.containsKey(newVehicle.getVehicleId())){
            System.out.println("\nEmployee ID Is Already Exist, Adding NOT Perform...");
        }else{
            vehicleMap.put(newVehicle.getVehicleId(), newVehicle);
            System.out.println("\nNew Employee Added Successfully... ");
            System.out.println("Vehicle ID: "+newVehicle.getVehicleId()+" | Vehicle Model: "+ newVehicle.getVehicleModel()+ " | Rental Price PerDay: "+newVehicle.getRentalPricePerDay());
        }
    }
}

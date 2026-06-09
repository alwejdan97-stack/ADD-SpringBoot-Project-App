package Manager;

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

        System.out.println("\n*** Display Existing Vehicle ***");
        if(vehicleMap.isEmpty()){
            System.out.println("NO Vehicle In The List, FAILD To Display");
        }else {
            for (Vehicle v : vehicleMap.values()) {
                System.out.println("Vehicle ID: " + v.getVehicleId() + " | Vehicle Model: " + v.getVehicleModel() + " | Rental Price PerDay: " + v.getRentalPricePerDay());
            }
        }

        System.out.println("\n*** Adding New Vehicle ***");
        Vehicle newvehicle=new Vehicle(101, "Toyota Camry", 45.00);
        addVehicle(newvehicle);

        System.out.println("\n*** Display Updated Vehicle List ***");
        if(vehicleMap.isEmpty()){
            System.out.println("NO Vehicle In The List, FAILD To Display");
        }else {
            for (Vehicle v : vehicleMap.values()) {
                System.out.println("Vehicle ID: " + v.getVehicleId() + " | Vehicle Model: " + v.getVehicleModel() + " | Rental Price PerDay: " + v.getRentalPricePerDay());
            }
        }
    }

    // method for adding vehicle
    public static void addVehicle(Vehicle newVehicle){
        if(vehicleMap.containsKey(newVehicle.getVehicleId())){
            System.out.println("Vehicle ID Is Already Exist, Adding NOT Perform...");
        }else{
            vehicleMap.put(newVehicle.getVehicleId(), newVehicle);
            System.out.println("New Vehicle Added Successfully... ");
            System.out.println("Vehicle ID: "+newVehicle.getVehicleId()+" | Vehicle Model: "+ newVehicle.getVehicleModel()+ " | Rental Price PerDay: "+newVehicle.getRentalPricePerDay());
        }
    }
}

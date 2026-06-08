package Services;

import Entities.Vehicle;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class VehicleService {
    public Map<Integer, Vehicle> vehicleMap=new HashMap<>();

    public VehicleService() {
        vehicleMap.put(101, new Vehicle(101, "Toyota Camry", 45.00));
        vehicleMap.put(202, new Vehicle(202, "Tesla Model 3", 85.50));
        vehicleMap.put(303, new Vehicle(303, "Ford Mustang", 120.00));
        vehicleMap.put(404, new Vehicle(404, "Nissan Sunny", 30.25));
    }

    public Collection<Vehicle> displayVehicle() {
        System.out.println("\n*** Display Existing Vehicle ***");
        if(vehicleMap.isEmpty()){
            System.out.println("NO Vehicle In The List, FAILD To Display");
        }else {
            for (Vehicle v : vehicleMap.values()) {
                System.out.println("Vehicle ID: " + v.getVehicleId() + " | Vehicle Model: " + v.getVehicleModel() + " | Rental Price PerDay: " + v.getRentalPricePerDay());
            }
        }
        return vehicleMap.values();
    }

    public Collection<Vehicle> displayUpdatedVehicle() {
        System.out.println("\n*** Display Updated Vehicle List ***");
        if(vehicleMap.isEmpty()){
            System.out.println("NO Vehicle In The List, FAILD To Display");
        }else {
            for (Vehicle v : vehicleMap.values()) {
                System.out.println("Vehicle ID: " + v.getVehicleId() + " | Vehicle Model: " + v.getVehicleModel() + " | Rental Price PerDay: " + v.getRentalPricePerDay());
            }
        }
        return vehicleMap.values();
    }

    public String addVehicle( Vehicle newVehicle) {
        if(vehicleMap.containsKey(newVehicle.getVehicleId())){
            return "Vehicle ID Is Already Exist, Adding NOT Perform...";
        }else{
            vehicleMap.put(newVehicle.getVehicleId(), newVehicle);
            System.out.println("New Vehicle Added Successfully... ");
            return "Vehicle ID: "+newVehicle.getVehicleId()+" | Vehicle Model: "+ newVehicle.getVehicleModel()+ " | Rental Price PerDay: "+newVehicle.getRentalPricePerDay();
        }
    }
}

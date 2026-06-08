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
}

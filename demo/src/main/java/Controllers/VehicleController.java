package Controllers;

import Entities.Employee;
import Entities.Vehicle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static Services.EmployeeManager.employeeMap;

@RestController
public class VehicleController {
    public Map<Integer, Vehicle> vehicleMap=new HashMap<>();

    public VehicleController() {
        vehicleMap.put(101, new Vehicle(101, "Toyota Camry", 45.00));
        vehicleMap.put(202, new Vehicle(202, "Tesla Model 3", 85.50));
        vehicleMap.put(303, new Vehicle(303, "Ford Mustang", 120.00));
        vehicleMap.put(404, new Vehicle(404, "Nissan Sunny", 30.25));
    }

    @GetMapping("/displayVehicle")
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

    @GetMapping("/displayUpdatedVehicle")
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

    @PostMapping("/addVehicleMap")
    public String addVehicleMap(@RequestBody Vehicle newVehicle) {
        if(vehicleMap.containsKey(newVehicle.getVehicleId())){
            return "Vehicle ID Is Already Exist, Adding NOT Perform...";
        }else{
            vehicleMap.put(newVehicle.getVehicleId(), newVehicle);
            System.out.println("New Vehicle Added Successfully... ");
            return "Vehicle ID: "+newVehicle.getVehicleId()+" | Vehicle Model: "+ newVehicle.getVehicleModel()+ " | Rental Price PerDay: "+newVehicle.getRentalPricePerDay();
        }
    }
}

package Task8App.demo.Controllers;

import Task8App.demo.Entities.Vehicle;
import Task8App.demo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @GetMapping("/displayVehicle")
    public Collection<Vehicle> displayVehicle() {
        return vehicleService.displayVehicle();
    }

    @GetMapping("/displayUpdatedVehicle")
    public Collection<Vehicle> displayUpdatedVehicle() {
        return vehicleService.displayUpdatedVehicle();
    }

    @PostMapping("/addVehicle")
    public Vehicle addVehicle(@RequestBody Vehicle newVehicle) {
        return vehicleService.addVehicle(newVehicle);
    }
}

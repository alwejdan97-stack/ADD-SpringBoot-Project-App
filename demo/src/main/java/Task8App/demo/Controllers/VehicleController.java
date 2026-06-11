package Task8App.demo.Controllers;

import Task8App.demo.Entities.Vehicle;
import Task8App.demo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping("saveVehicle")
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);
    }

    @GetMapping("getAllVehicle")
    public List<Vehicle> getAllVehicle(){
       return vehicleService.getAllVehicle();
    }

    @GetMapping("getById")
    public Vehicle getById(@RequestParam Integer id){
       return vehicleService.getById(id);
    }

    @GetMapping("getNameById")
    public String getNameById(@RequestParam Integer id){
        return vehicleService.getNameById(id);
    }

    @PutMapping("updateVehicle")
    public Vehicle updateVehicle(@RequestParam Integer id,@RequestParam String model){
        return vehicleService.updateVehicle(id,model);
    }

    @DeleteMapping("deleteVehicle")
    public String deleteVehicle(@RequestParam Integer id){
       return vehicleService.deleteVehicle(id);
    }
}

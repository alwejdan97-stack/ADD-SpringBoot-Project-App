package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleInterface extends JpaRepository<Vehicle,Integer> {

    Vehicle saveVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicle();

    Vehicle getById(Integer id);

    String getNameById(Integer id);

}

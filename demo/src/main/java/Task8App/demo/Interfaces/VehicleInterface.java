package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleInterface extends JpaRepository<Vehicle,Integer> {

    Vehicle saveVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicle();
    @Query("SELECT V.vehicleModel FROM Vehicle V WHERE V.vehicleId=:id")
    Vehicle getById(Integer id);

    @Query("SELECT V.vehicleModel FROM Vehicle V WHERE V.vehicleId=:id")
    String getNameById(@Param("id") Integer id);

}

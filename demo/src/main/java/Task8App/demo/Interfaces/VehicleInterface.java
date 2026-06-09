package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInterface extends JpaRepository<Vehicle,Integer> {
}

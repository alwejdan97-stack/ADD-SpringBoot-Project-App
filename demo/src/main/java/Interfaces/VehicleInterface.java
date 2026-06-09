package Interfaces;

import Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInterface extends JpaRepository<Vehicle,Integer> {
}

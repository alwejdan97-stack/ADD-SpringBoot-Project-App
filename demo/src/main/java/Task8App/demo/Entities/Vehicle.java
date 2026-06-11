package Task8App.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;

    private String vehicleModel;
    private double rentalPricePerDay;

    /*@ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;*/

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    public Vehicle(int vehicleId, String vehicleModel, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }
}

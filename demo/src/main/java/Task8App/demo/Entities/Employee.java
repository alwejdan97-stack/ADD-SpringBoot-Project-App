package Task8App.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int employeeId;
    private String employeeName;
    private String department;

    /*@OneToMany(mappedBy = "employee")
    private List<Vehicle> vehicleList;*/

    @ManyToMany
    @JoinTable(name = "Employee_Campaign",
            joinColumns=@JoinColumn(name = "employee_id"),
            inverseJoinColumns=@JoinColumn(name = "campaign_id"))
    private List<Campaign> campaign;
   public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }
}

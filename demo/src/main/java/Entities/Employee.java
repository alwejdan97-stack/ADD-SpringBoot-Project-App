package Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import org.jspecify.annotations.NonNull;

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

    @OneToMany(mappedBy = "employee")
    private Collection<Vehicle> vehicleList;

    @JoinTable(name = "Employee_Campaign",
            JoinColumns=(@JoinColumn(name = "employee_id"),
                        @JoinColumn(name = "compagin_id"));
    private Collection<Campaign> compagins;
   public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }
}

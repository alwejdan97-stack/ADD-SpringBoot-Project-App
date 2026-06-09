package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInterface extends JpaRepository<Employee,Integer> {
}

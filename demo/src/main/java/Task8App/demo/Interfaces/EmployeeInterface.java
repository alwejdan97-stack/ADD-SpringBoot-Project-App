package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Employee;
import Task8App.demo.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeInterface extends JpaRepository<Employee,Integer> {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getById(Integer id);

    Employee getNameById(Integer id);
}

package Task8App.demo.Interfaces;

import Task8App.demo.Entities.Employee;
import Task8App.demo.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeInterface extends JpaRepository<Employee,Integer> {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    @Query("SELECT C.employeeName FROM Employee E WHERE E.employeeId=:id")
    Employee getById(@Param("id") Integer id);

    @Query("SELECT C.employeeName FROM Employee E WHERE E.employeeId=:id")
    String getNameById(@Param("id") Integer id);
}

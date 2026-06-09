package Controllers;

import Entities.Employee;
import Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/displayEmployee")
    public Collection<Employee> displayEmployee() {
        return employeeService.displayEmployee();
    }

    @GetMapping("/displayUpdatedEmployee")
    public Collection<Employee> displayUpdatedEmployee() {
        return employeeService.displayUpdatedEmployee();
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee newEmployee) {
        return employeeService.addEmployee(newEmployee);
    }
}

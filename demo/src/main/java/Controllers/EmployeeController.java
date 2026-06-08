package Controllers;

import Entities.Employee;
import Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
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
    public String addEmployee(@RequestBody Employee newEmployee) {
        return employeeService.addEmployee(newEmployee);
    }
}

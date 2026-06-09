package Task8App.demo.Controllers;

import Task8App.demo.Entities.Employee;
import Task8App.demo.Services.EmployeeService;
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
        return employeeService.show();
    }

    @GetMapping("/displayUpdatedEmployee")
    public Collection<Employee> displayUpdatedEmployee() {
        return employeeService.show();
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee newEmployee) {
        return employeeService.save(newEmployee);
    }
}

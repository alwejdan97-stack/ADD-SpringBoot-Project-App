package Task8App.demo.Controllers;

import Task8App.demo.Entities.Employee;
import Task8App.demo.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("getById")
    public Employee getById(@RequestParam Integer id){
        return employeeService.getById(id);
    }

    @GetMapping("getNameById")
    public String getNameById(@RequestParam Integer id){
        return employeeService.getNameById(id);
    }

    @PutMapping("updateEmployee")
    public Employee updateEmployee(@RequestParam Integer id,@RequestParam String name){
        return employeeService.updateEmployee(id,name);
    }

    @DeleteMapping("deleteEmployee")
    public String deleteEmployee(@RequestParam Integer id){
        return employeeService.deleteEmployee(id);
    }
}

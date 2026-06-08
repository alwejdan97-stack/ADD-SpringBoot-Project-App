package Controllers;

import Entities.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {
    public Map<Integer, Employee> employeeMap=new HashMap<>();

    public EmployeeController() {
        employeeMap.put(101, new Employee(101, "Ahmed", "IT"));
        employeeMap.put(202, new Employee(202, "Ali", "ABI"));
        employeeMap.put(303, new Employee(303, "Omar", "English"));
        employeeMap.put(404, new Employee(404, "Sara", "Islamics"));
    }

    @GetMapping("/displayEmployee")
    public Collection<Employee> displayEmployee() {
        System.out.println("\n*** Display Existing Employees ***");
        for(Employee e:employeeMap.values()){
            System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());
        }
        return employeeMap.values();
    }

    @GetMapping("/displayUpdatedEmployee")
    public Collection<Employee> displayUpdatedEmployee() {
        System.out.println("\n*** Display Updated Employees List ***");
        if(employeeMap.isEmpty()){
            System.out.println("NO Employee In The List, FAILD To Display");
        }else{
            for(Employee e:employeeMap.values()){
                System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());
            }
        }
        return employeeMap.values();
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee newEmployee) {
        if(employeeMap.containsKey(newEmployee.getEmployeeId())){
            return "Employee ID Is Already Exist, Adding NOT Perform...";
        }else{
            employeeMap.put(newEmployee.getEmployeeId(), newEmployee);
            System.out.println("New Employee Added Successfully... ");
            return "Employee ID: "+newEmployee.getEmployeeId()+" | Employee Name: "+ newEmployee.getEmployeeName()+ " | Department: "+newEmployee.getDepartment();
        }
    }
}

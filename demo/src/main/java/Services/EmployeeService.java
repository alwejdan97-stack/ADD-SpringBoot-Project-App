package Services;

import Entities.Employee;

import Interfaces.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService{

    //MySQL codes
    @Autowired
    private EmployeeInterface employeeRepository;

    public List<Employee> displayEmployee() {
        return employeeRepository.findAll();
    }

    public List<Employee> displayUpdatedEmployee() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    //Service code

    /*public Map<Integer, Employee> employeeMap=new HashMap<>();
    public EmployeeService() {
        employeeMap.put(101, new Employee(101, "Ahmed", "IT"));
        employeeMap.put(202, new Employee(202, "Ali", "ABI"));
        employeeMap.put(303, new Employee(303, "Omar", "English"));
        employeeMap.put(404, new Employee(404, "Sara", "Islamics"));
    }

    public Collection<Employee> displayEmployee() {
        System.out.println("\n*** Display Existing Employees ***");
        for(Employee e:employeeMap.values()){
            System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());
        }
        return employeeMap.values();
    }

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

    public String addEmployee(Employee newEmployee) {
        if(employeeMap.containsKey(newEmployee.getEmployeeId())){
            return "Employee ID Is Already Exist, Adding NOT Perform...";
        }else{
            employeeMap.put(newEmployee.getEmployeeId(), newEmployee);
            System.out.println("New Employee Added Successfully... ");
            return "Employee ID: "+newEmployee.getEmployeeId()+" | Employee Name: "+ newEmployee.getEmployeeName()+ " | Department: "+newEmployee.getDepartment();
        }
    }*/
}

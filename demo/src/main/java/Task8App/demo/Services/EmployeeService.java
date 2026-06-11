package Task8App.demo.Services;

import Task8App.demo.Entities.Employee;

import Task8App.demo.Entities.Vehicle;
import Task8App.demo.Interfaces.EmployeeInterface;
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
    EmployeeInterface employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee getById(Integer id){
        if(!employeeRepository.existsById(id)){
            System.out.println("ID NOT Found");
        }
        return employeeRepository.getById(id);
    }

    public String getNameById(Integer id){
        if(!employeeRepository.existsById(id)){
            return "ID NOT Found";
        }
        return employeeRepository.getNameById(id);
    }

    public Employee updateEmployee(Integer id,String name){
        Employee employee=employeeRepository.findById(id).get();
        if(!employee.getEmployeeName().equals(name)){
            employee.setEmployeeName(name);
        }
        return employeeRepository.save(employee);
    }

    public String deleteEmployee(Integer id){
        if(!employeeRepository.existsById(id)){
            return "ID NOT Found...";
        }else{
            Employee employee=employeeRepository.findById(id).get();
            employeeRepository.save(employee);
            return "DELETED...";
        }
    }


    //Service code
   /*public Map<Integer, Employee> employeeMap=new HashMap<>();
    public EmployeeService() {
        employeeMap.put(101, new Employee(101, "Ahmed", "IT"));
        employeeMap.put(202, new Employee(202, "Ali", "ABI"));
        employeeMap.put(303, new Employee(303, "Omar", "English"));
        employeeMap.put(404, new Employee(404, "Sara", "Islamics"));
    }

    public List<Employee> displayEmployee() {
        System.out.println("\n*** Display Existing Employees ***");
        for(Employee e:employeeMap.values()){
            System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());
        }
        return employeeMap.values().stream().toList();
    }

    public List<Employee> displayUpdatedEmployee() {
        System.out.println("\n*** Display Updated Employees List ***");
        if(employeeMap.isEmpty()){
            System.out.println("NO Employee In The List, FAILD To Display");
        }else{
            for(Employee e:employeeMap.values()){
                System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());
            }
        }
        return employeeMap.values().stream().toList();
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

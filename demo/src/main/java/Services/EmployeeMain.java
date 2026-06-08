package Services;

import Entities.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
    public static Map<Integer,Employee> employeeMap=new HashMap<>();
    public static void main(String[] args) {
        employeeMap.put(1, new Employee(101, "Ahmed", "IT"));
        employeeMap.put(2, new Employee(202, "Ali", "ABI"));
        employeeMap.put(3, new Employee(303, "Omar", "English"));
        employeeMap.put(4, new Employee(404, "Sara", "Islamics"));

        System.out.println("*** Display Existing Employees ***");
        for(Employee e:employeeMap.values()){
            System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());

        }

        Employee newEmployee=new Employee(505,"Wejdan","IT");
        if(employeeMap.containsKey(newEmployee.getEmployeeId())){
            System.out.println("Employee ID Is Already Exist, Adding NOT Perform...");
        }else{
            employeeMap.put(newEmployee.getEmployeeId(), newEmployee);
            System.out.println("\nNew Employee Added Successfully... ");
            System.out.println("Employee ID: "+newEmployee.getEmployeeId()+" | Employee Name: "+ newEmployee.getEmployeeName()+ " | Department: "+newEmployee.getDepartment());

        }

        System.out.println("\n*** Display Updated Employees List ***");
        if(employeeMap.isEmpty()){
            System.out.println("NO Employee In The List, FAILD To Display");
        }else{
            for(Employee e:employeeMap.values()){
                System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());
            }
        }
    }
}

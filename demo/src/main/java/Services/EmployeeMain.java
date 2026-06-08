package Services;

import Entities.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
    public static Map<String,Employee> employeeMap=new HashMap<>();
    public static void main(String[] args) {
        employeeMap.put("E1", new Employee(101, "Ahmed", "IT"));
        employeeMap.put("E2", new Employee(202, "Ali", "ABI"));
        employeeMap.put("E3", new Employee(303, "Omar", "English"));
        employeeMap.put("E4", new Employee(404, "Sara", "Islamics"));

        System.out.println("*** Display Existing Employees ***");
        for(Employee e:employeeMap.values()){
            System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());

        }


        Employee newEmployee=new Employee(505,"Wejdan","IT");
        if(employeeMap.containsKey(newEmployee.getEmployeeId())){
            System.out.println("Employee ID Is Already Exist, Adding NOT Perform...");
        }else{
            System.out.println("New Employee Added: \n"+
                    "Employee ID: "+newEmployee.getEmployeeId()+" | Employee Name: "+ newEmployee.getEmployeeName()+ " | Department: "+newEmployee.getDepartment());
        }
    }
}

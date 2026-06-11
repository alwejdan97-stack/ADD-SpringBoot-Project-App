//package Task8App.demo.Manager;
//
//import Task8App.demo.Entities.Employee;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class EmployeeManager {
//    public static Map<Integer,Employee> employeeMap=new HashMap<>();
//    public static void main(String[] args) {
//        employeeMap.put(101, new Employee(101, "Ahmed", "IT"));
//        employeeMap.put(202, new Employee(202, "Ali", "ABI"));
//        employeeMap.put(303, new Employee(303, "Omar", "English"));
//        employeeMap.put(404, new Employee(404, "Sara", "Islamics"));
//
//        System.out.println("\n*** Display Existing Employees ***");
//        if(employeeMap.isEmpty()){
//            System.out.println("NO Employee In The List, FAILD To Display");
//        }else{
//        for(Employee e:employeeMap.values()) {
//            System.out.println("Employee ID: " + e.getEmployeeId() + " | Employee Name: " + e.getEmployeeName() + " | Department: " + e.getDepartment());
//            }
//        }
//        System.out.println("\n*** Adding New Employee ***");
//        Employee newEmployee=new Employee(101, "Ahmed", "IT");
//        postOperation(newEmployee);
//
//        System.out.println("\n*** Display Updated Employees List ***");
//        if(employeeMap.isEmpty()){
//            System.out.println("NO Employee In The List, FAILD To Display");
//        }else{
//            for(Employee e:employeeMap.values()){
//                System.out.println("Employee ID: "+e.getEmployeeId()+" | Employee Name: "+ e.getEmployeeName()+ " | Department: "+e.getDepartment());
//            }
//        }
//    }
//
//    public static void postOperation(Employee newEmployee){
//        if(employeeMap.containsKey(newEmployee.getEmployeeId())){
//            System.out.println("Employee ID Is Already Exist, Adding NOT Perform...");
//        }else{
//            employeeMap.put(newEmployee.getEmployeeId(), newEmployee);
//            System.out.println("New Employee Added Successfully... ");
//            System.out.println("Employee ID: "+newEmployee.getEmployeeId()+" | Employee Name: "+ newEmployee.getEmployeeName()+ " | Department: "+newEmployee.getDepartment());
//        }
//    }
//}

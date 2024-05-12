package corejava;

import java.util.*;
//implements Comparable<Employee>
class Employee  {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

   // @Override
   // public int compareTo(Employee otherEmployee) {
   //     return Integer.compare(this.empId, otherEmployee.getEmpId());
 //   }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Employee Name: " + empName;
    }
}

public class comparable {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John"));
        employees.add(new Employee(103, "Alice"));
        employees.add(new Employee(102, "Bob"));
        
        System.out.println("Before sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    Collections.sort(employees);

        //System.out.println("\nAfter sorting by employee ID:");
        //for (Employee emp : employees) {
        //    System.out.println(emp);
      //  }
    }
}

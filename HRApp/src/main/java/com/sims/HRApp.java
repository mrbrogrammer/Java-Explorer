package com.sims;

import java.util.Arrays;
import java.util.stream.Stream;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp starts");
    
        Employee e1 = new Employee(230, "Jerry", 333_998);
        Employee e2 = new Employee(420, "Gracie", 3_392_823);
    
        Department dept = new Department("Education");
    
        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.addEmployee(new Employee(772, "Jack", 2_998));
    
        Employee[] emps = dept.getEmployees();
    
        Stream.of(emps).parallel().
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    
        System.out.println("Total: " + dept.getTotalSalary());
        System.out.println("Average: " + dept.getAverageSalary());
    
        //testing employee search
        System.out.println(dept.getEmployeeById(420));
        System.out.println(dept.getEmployeeById(23_122));
    }
}
package com.sims;

public class Department {
    private String name;
    
    private Employee[] employees = new Employee[10];
    
    private int lastEmployeeAdded = -1;
    
    public Department(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmployee(Employee employee) {
        lastEmployeeAdded ++;
        employees[lastEmployeeAdded] = employee;
    }
    
    public Employee[] getEmployees() {
        Employee[] arr = new Employee[lastEmployeeAdded + 1];
    
        for (int index = 0; index < arr.length; index++) {
            arr[index] = employees[index];
        }
        
        return arr;
    }
    
    public Employee getEmployeeById(int id) {
        for (int index = 0; index < getEmployees().length; index++) {
            if (getEmployees()[index].getID() == id ) {
                return getEmployees()[index];
            }
        }
        return null;
    }
    
    public double getTotalSalary() {
        
        double totalSalary = 0;
        for (int index = 0; index < getEmployees().length; index++) {
            totalSalary += getEmployees()[index].getSalary();
        }
        
        return totalSalary;
    }
    
    public double getAverageSalary() {
        
        double totalSalary = 0;
        for (int index = 0; index < getEmployees().length; index++) {
            totalSalary += getEmployees()[index].getSalary();
        }
        
        return totalSalary / getEmployees().length;
    }
    
    @Override
    public String toString() {
        return getName();
    }
}

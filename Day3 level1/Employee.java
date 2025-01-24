public class Employee {
    // Static variable: shared across all employees
    static String companyName = "Tech Innovators Inc.";
    
    // Static variable to track total number of employees
    static int totalEmployees = 0;
    
    // Final variable: employee ID cannot be changed once assigned
    final int id;
    
    // Instance variables
    String name;
    String designation;

    // Constructor to initialize employee details
    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id; // Employee ID is final, so it can only be assigned once
        
        // Increment total employee count every time a new employee is created
        totalEmployees++;
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create employee instances
        Employee emp1 = new Employee("Alice", "Software Engineer", 101);
        Employee emp2 = new Employee("Bob", "Data Analyst", 102);
        Employee emp3 = new Employee("Charlie", "Project Manager", 103);

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();

        // Display total number of employees
        Employee.displayTotalEmployees();
    }
}

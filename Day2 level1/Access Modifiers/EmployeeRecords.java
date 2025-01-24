// Parent class Employee
class Employee {
    // Instance variables
    public int employeeID;   // public - can be accessed directly
    protected String department;  // protected - can be accessed within the same package or subclass
    private double salary;   // private - can only be accessed via getter/setter methods

    // Constructor to initialize Employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void modifySalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    // Getter method for salary (private variable)
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

// Subclass Manager
class Manager extends Employee {
    // Constructor to initialize Manager details (calling parent constructor)
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display Manager details, including access to employeeID and department
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);    // Accessing public employeeID directly
        System.out.println("Department: " + department);    // Accessing protected department directly
        System.out.println("Salary: " + getSalary());       // Accessing private salary through getter method
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee employee = new Employee(101, "IT", 50000.00);
        employee.displayEmployeeDetails();

        // Creating an instance of Manager
        Manager manager = new Manager(201, "HR", 75000.00);
        manager.displayManagerDetails();

        // Modifying salary using the public method
        manager.modifySalary(80000.00);
        System.out.println("\nUpdated Manager Details:");
        manager.displayManagerDetails();
    }
}

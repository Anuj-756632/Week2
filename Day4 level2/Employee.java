import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments; // A company has many departments

    // Constructor to initialize the company and its departments
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to remove a department from the company
    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    // Method to show all departments and their employees
    public void showDepartments() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.showEmployees();
        }
    }

    // Get the name of the company
    public String getName() {
        return name;
    }
}
//Department class

public class Department {
    private String departmentName;
    private List<Employee> employees; // A department contains multiple employees

    // Constructor to initialize the department with a name
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>(); // Initialize the list of employees
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to show all employees in the department
    public void showEmployees() {
        System.out.println("  Department: " + departmentName);
        for (Employee employee : employees) {
            System.out.println("    Employee: " + employee.getName());
        }
    }

    // Get the department name
    public String getDepartmentName() {
        return departmentName;
    }
}

//Employee class

public class Employee {
    private String name;

    // Constructor to initialize employee name
    public Employee(String name) {
        this.name = name;
    }

    // Get the name of the employee
    public String getName() {
        return name;
    }
}
public class Employee {
    private String name;

    // Constructor to initialize employee name
    public Employee(String name) {
        this.name = name;
    }

    // Get the name of the employee
    public String getName() {
        return name;
    }
}


//main class

public class CompanyManagement {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Tech Solutions");

        // Create departments for the company
        Department department1 = new Department("HR");
        Department department2 = new Department("IT");

        // Create employees for each department
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Charlie");

        // Add employees to departments
        department1.addEmployee(emp1);
        department1.addEmployee(emp2);
        department2.addEmployee(emp3);

        // Add departments to the company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Show the company structure with departments and employees
        company.showDepartments();

        // Remove all departments and employees when the company is deleted
        company.removeAllDepartments();
        
        // Show the company structure after removal
        System.out.println("\nAfter removing all departments:");
        company.showDepartments();
    }
}

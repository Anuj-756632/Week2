public class Employee {
    // Static variable shared by all employees
    static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0; // Counter for the total number of employees

    // Final variable for employee ID (cannot be modified)
    private final String id;

    // Instance variables for name and designation
    private String name;
    private String designation;

    // Constructor
    public Employee(String name, String designation, String id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++; // Increment total employee count upon creation of a new employee object
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details if the object is an instance of Employee class
    public void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("This is not a valid Employee object.");
        }
    }

    // Getter methods for the instance variables
    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("Alice", "Software Engineer", "E123");
        Employee emp2 = new Employee("Bob", "Product Manager", "E124");

        // Displaying total employees using the static method
        Employee.displayTotalEmployees();

        // Displaying employee details using the method with instanceof check
        emp1.displayEmployeeDetails(emp1);
        emp2.displayEmployeeDetails(emp2);
    }
}

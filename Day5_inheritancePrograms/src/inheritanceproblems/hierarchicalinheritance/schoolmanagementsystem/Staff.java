package inheritanceproblems.hierarchicalinheritance.schoolmanagementsystem;

class Staff extends Person {
    private String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age); // Calling the constructor of the superclass (Person)
        this.department = department;
    }

    // Getter method for department
    public String getDepartment() {
        return department;
    }

    // Overridden method to display role for Staff
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

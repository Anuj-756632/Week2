import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments; // Composition: University owns Departments

    // Constructor to initialize the university and its departments
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to show all departments in the university
    public void showDepartments() {
        System.out.println("University: " + name);
        for (Department department : departments) {
            department.showFaculty();
        }
    }

    // Cleanup: Deleting a university also removes its departments
    public void removeAllDepartments() {
        departments.clear(); // Removes all departments
        System.out.println("All departments have been removed.");
    }
}

//Department Class
public class Department {
    private String name;
    private List<Faculty> facultyMembers; // Aggregation: Faculty can exist outside a Department

    // Constructor to initialize the department with a name
    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Method to show all faculty members in the department
    public void showFaculty() {
        System.out.println("  Department: " + name);
        for (Faculty faculty : facultyMembers) {
            System.out.println("    Faculty: " + faculty.getName());
        }
    }

    // Get the department name
    public String getName() {
        return name;
    }
}

//Faculty class
public class Faculty {
    private String name;

    // Constructor to initialize faculty name
    public Faculty(String name) {
        this.name = name;
    }

    // Get the name of the faculty member
    public String getName() {
        return name;
    }
}

//Main Class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Global University");

        // Create departments for the university
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");
        Faculty faculty3 = new Faculty("Dr. Charlie");

        // Add faculty members to departments
        department1.addFaculty(faculty1); // Dr. Alice is part of Computer Science
        department1.addFaculty(faculty2); // Dr. Bob is part of Computer Science
        department2.addFaculty(faculty3); // Dr. Charlie is part of Mathematics

        // Add departments to the university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Show all departments and their faculty members
        university.showDepartments();

        // Remove all departments from the university (deletes departments and faculty)
        university.removeAllDepartments();
        System.out.println("\nAfter removing all departments:");
        university.showDepartments();

        // Demonstrate Faculty can exist independently of Department
        Faculty faculty4 = new Faculty("Dr. David");
        // Dr. David can exist outside any department
        System.out.println("\nDr. David is an independent faculty member.");
    }
}

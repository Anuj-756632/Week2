package inheritanceproblems.hierarchicalinheritance.schoolmanagementsystem;

public class UsePerson {
    public static void main(String[] args) {
        // Creating instances of each role
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("John Doe", 16, "10th Grade");
        Staff staff = new Staff("Jane Doe", 35, "Administration");

        // Displaying the details and role for each person
        System.out.println("=== Teacher ===");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println("\n=== Student ===");
        student.displayDetails();
        student.displayRole();

        System.out.println("\n=== Staff ===");
        staff.displayDetails();
        staff.displayRole();
    }
}

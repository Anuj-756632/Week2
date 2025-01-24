// Parent class Student
class Student {
    // Instance variables
    public int rollNumber;  // public - can be accessed directly
    protected String name;  // protected - can be accessed within the same package or subclass
    private double CGPA;  // private - can only be accessed via getter/setter methods

    // Constructor to initialize the Student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass PostgraduateStudent
class PostgraduateStudent extends Student {
    // Constructor to initialize the PostgraduateStudent details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display the details of the Postgraduate student, including protected 'name' member
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);  // Accessing public rollNumber directly
        System.out.println("Name: " + name);  // Accessing protected 'name' directly
        System.out.println("CGPA: " + getCGPA());  // Accessing private 'CGPA' through getter method
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student student = new Student(101, "John Doe", 8.5);
        student.displayStudentDetails();

        // Creating an instance of PostgraduateStudent
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Alice Smith", 9.2);
        pgStudent.displayPostgraduateDetails();

        // Modifying CGPA using public setter method
        pgStudent.setCGPA(9.5);
        System.out.println("\nUpdated Postgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}

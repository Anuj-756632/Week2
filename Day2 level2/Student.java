public class Student {
    // Static variable shared by all students
    static String universityName = "Global University";  // Shared across all students
    private static int totalStudents = 0;  // Counter for the total number of students enrolled

    // Final variable for rollNumber (ensures the roll number cannot be changed after assignment)
    private final String rollNumber;

    // Instance variables for student details
    private String name;
    private String grade;

    // Constructor to initialize name, rollNumber, and grade
    public Student(String name, String grade, String rollNumber) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        totalStudents++; // Increment the total number of students when a new student is created
    }

    // Static method to display total number of students enrolled
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details if the object is an instance of Student class
    public void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("This is not a valid Student object.");
        }
    }

    // Method to update the grade of a student, only if the object is an instance of Student
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("This is not a valid Student object. Grade cannot be updated.");
        }
    }

    // Getter methods for student details
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice", "A", "S12345");
        Student student2 = new Student("Bob", "B+", "S12346");

        // Displaying total students
        Student.displayTotalStudents();

        // Displaying student details
        student1.displayStudentDetails(student1);
        student2.displayStudentDetails(student2);

        // Updating grades (checking instanceof before updating)
        student1.updateGrade(student1, "A+");
        student2.updateGrade(student2, "B");

        // Displaying updated student details
        student1.displayStudentDetails(student1);
        student2.displayStudentDetails(student2);
    }
}

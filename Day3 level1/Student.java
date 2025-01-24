public class Student {
    // Static variable to store the university name shared by all students
    static String universityName = "XYZ University";

    // Static variable to track the number of students enrolled
    static int totalStudents = 0;

    // Instance variables for name, rollNumber, and grade
    String name;
    final String rollNumber;  // final variable to ensure roll number can't be changed
    String grade;

    // Constructor to initialize the student's name, rollNumber, and grade
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;  // Increment the total students count whenever a new student is created
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade, only if the object is an instance of Student
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {  // Check if the object is an instance of Student
            this.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Operation not allowed. Not a valid Student object.");
        }
    }

    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice", "S001", "A");
        Student student2 = new Student("Bob", "S002", "B");

        // Displaying total students enrolled
        Student.displayTotalStudents();

        // Displaying student details
        student1.displayDetails();
        student2.displayDetails();

        // Updating grade (valid operation)
        student1.updateGrade(student1, "A+");

        // Trying to update grade with a non-student object (invalid operation)
        String notAStudent = "Not a student";
        student1.updateGrade(notAStudent, "B");
    }
}

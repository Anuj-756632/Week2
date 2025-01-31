package linkedlistpracticeproblems.singlylinkedlist;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        // Add some students
        studentList.addAtBeginning(1, "John", 20, 'A');
        studentList.addAtEnd(2, "Emma", 21, 'B');
        studentList.addAtEnd(3, "Sophia", 22, 'C');
        studentList.addAtPosition(1, "Liam", 23, 'A', 2);

        // Display all students
        System.out.println("All student records:");
        studentList.displayAllStudents();

        // Search for a student by Roll Number
        System.out.println("\nSearching for student with Roll No: 2");
        studentList.searchByRollNumber(2);

        // Update student's grade
        System.out.println("\nUpdating grade for Roll No: 2");
        studentList.updateGrade(2, 'A');

        // Display all students after update
        System.out.println("\nAll student records after grade update:");
        studentList.displayAllStudents();

        // Delete a student by Roll Number
        System.out.println("\nDeleting student with Roll No: 3");
        studentList.deleteByRollNumber(3);

        // Display all students after deletion
        System.out.println("\nAll student records after deletion:");
        studentList.displayAllStudents();
    }
}
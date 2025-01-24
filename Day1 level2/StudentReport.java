import java.util.Scanner;
class Student{
    private String name;
    private String rollNumber;
    private double marks;

    // Constructor to initialize Student object
    public Student(String name, String rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
public class StudentReport {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name=sc.nextLine();

        System.out.println("Enter RollNumber: ");
        String rollNumber=sc.next();

        System.out.println("Enter Marks: ");
        int marks=sc.nextInt();
        Student report=new Student(name, rollNumber, marks);
        report.calculateGrade();
        report.displayStudentDetails();
    }
}

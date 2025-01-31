import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Subject> subjects; // Aggregation - a Student has multiple Subjects

    // Constructor
    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    // Add a Subject to the Student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}


class Subject {
    private String subjectName;
    private double marks;

    // Constructor
    public Subject(String subjectName, double marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getter and Setter methods
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Subject: " + subjectName + ", Marks: " + marks;
    }
}

class GradeCalculator {
    // Method to calculate the average grade of a student
    public double calculateAverage(Student student) {
        List<Subject> subjects = student.getSubjects();
        double totalMarks = 0;
        int numSubjects = subjects.size();

        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }

        return (numSubjects > 0) ? totalMarks / numSubjects : 0;
    }

    // Method to get the grade letter based on the average score
    public String getGradeLetter(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else {
            return "F";
        }
    }

    // Method to print the result for a student
    public void printResult(Student student) {
        double average = calculateAverage(student);
        String gradeLetter = getGradeLetter(average);

        System.out.println("Student: " + student.getName());
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + gradeLetter);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating subjects
        Subject math = new Subject("Mathematics", 90);
        Subject science = new Subject("Science", 85);

        // Creating a student and adding subjects
        Student student = new Student("John");
        student.addSubject(math);
        student.addSubject(science);
        

        // Creating GradeCalculator instance and printing result
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.printResult(student);
    }
}

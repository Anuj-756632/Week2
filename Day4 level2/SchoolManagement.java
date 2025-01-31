import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students; // Aggregation relationship: school has students

    // Constructor to initialize the school
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to show all students in the school
    public void showStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

//Student Class

public class Student {
    private String name;
    private List<Course> courses; // Association: student can enroll in multiple courses

    // Constructor to initialize the student
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method for the student to enroll in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Add student to the course's student list
        }
    }

    // Method to view all courses the student is enrolled in
    public void viewCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("  Course: " + course.getName());
        }
    }

    // Get the name of the student
    public String getName() {
        return name;
    }
}
//Course class

public class Course {
    private String name;
    private List<Student> students; // Association: course can have multiple students

    // Constructor to initialize the course
    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to view all students enrolled in the course
    public void viewStudents() {
        System.out.println("Course: " + name);
        for (Student student : students) {
            System.out.println("  Student: " + student.getName());
        }
    }

    // Get the name of the course
    public String getName() {
        return name;
    }
}

//Main Class
public class SchoolManagement {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Green Valley School");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enrollInCourse(course1); // Alice enrolls in Mathematics
        student1.enrollInCourse(course2); // Alice enrolls in Science
        student2.enrollInCourse(course1); // Bob enrolls in Mathematics

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Show all students in the school
        school.showStudents();

        // Show all courses a student is enrolled in
        student1.viewCourses();
        student2.viewCourses();

        // Show all students in each course
        course1.viewStudents();
        course2.viewStudents();
    }
}

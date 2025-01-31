import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Professor professor;
    private List<Student> students;

    // Constructor to initialize the course
    public Course(String name) {
        this.name = name;
        this.professor = null; // No professor assigned initially
        this.students = new ArrayList<>();
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " is assigned to the course " + this.name);
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has enrolled in " + this.name);
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students: ");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }

    // Get course name
    public String getName() {
        return name;
    }
}

//Professor class
public class Professor {
    private String name;

    // Constructor to initialize the professor
    public Professor(String name) {
        this.name = name;
    }

    // Get professor name
    public String getName() {
        return name;
    }

    // Method to assign the professor to a course
    public void assignCourse(Course course) {
        course.assignProfessor(this);
    }
}

//Student class
public class Student {
    private String name;
    private List<Course> courses;

    // Constructor to initialize the student
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Method for student to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Enroll the student in the course as well
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses: ");
        for (Course course : courses) {
            System.out.println("  - " + course.getName());
        }
    }
}

//Main class
public class AdvanceUniversityManagement {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create courses
        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Mathematics 101");

        // Assign professors to courses
        professor1.assignCourse(course1); // Dr. Smith teaches CS101
        professor2.assignCourse(course2); // Dr. Johnson teaches Math101

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Students enroll in courses
        student1.enrollCourse(course1); // Alice enrolls in CS101
        student1.enrollCourse(course2); // Alice enrolls in Math101
        student2.enrollCourse(course1); // Bob enrolls in CS101

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}

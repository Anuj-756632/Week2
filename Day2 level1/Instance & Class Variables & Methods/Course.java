public class Course {
    // Instance variables
    private String courseName;
    private int duration;  // Duration in weeks (for example)
    private double fee;

    // Class variable (common for all courses)
    private static String instituteName = "Default Institute";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display the course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to modify the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating courses
		
        Course course1 = new Course("Java Programming", 12, 500.0);
        Course course2 = new Course("Data Science", 16, 800.0);
        Course course3 = new Course("Web Development", 10, 400.0);

        // Displaying course details before updating institute name
        System.out.println("Before updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        // Update the institute name for all courses
        Course.updateInstituteName("Tech Academy");

        // Displaying course details after updating institute name
        System.out.println("\nAfter updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}

package inheritanceproblems.multilevelinheritance;

public class UseCourse {
    public static void main(String[] args) {
        // Creating instances of each course type
        Course course = new Course("Introduction to Java", 30);
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java Programming", 40, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Mastering Python", 45, "Coursera", true, 150.0, 10.0);

        // Displaying the details of each course
        System.out.println("=== Course ===");
        course.displayCourseDetails();

        System.out.println("\n=== Online Course ===");
        onlineCourse.displayCourseDetails();

        System.out.println("\n=== Paid Online Course ===");
        paidOnlineCourse.displayCourseDetails();
    }
}

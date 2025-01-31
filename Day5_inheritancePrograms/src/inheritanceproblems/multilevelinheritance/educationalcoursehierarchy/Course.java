package inheritanceproblems.multilevelinheritance.educationalcoursehierarchy;

class Course {
    private String courseName;
    private int duration; // duration in hours

    // Constructor for Course
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getter methods for Course
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

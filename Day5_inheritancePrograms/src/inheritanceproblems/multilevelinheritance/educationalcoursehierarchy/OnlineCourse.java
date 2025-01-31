package inheritanceproblems.multilevelinheritance.educationalcoursehierarchy;

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    // Constructor for OnlineCourse
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Calling the constructor of the superclass (Course)
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Getter methods for OnlineCourse
    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    // Overridden method to display online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Calling displayCourseDetails() from Course
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

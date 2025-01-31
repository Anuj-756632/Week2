package inheritanceproblems.multilevelinheritance;

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    // Constructor for PaidOnlineCourse
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Calling the constructor of the superclass (OnlineCourse)
        this.fee = fee;
        this.discount = discount;
    }

    // Getter methods for PaidOnlineCourse
    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    // Overridden method to display paid online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Calling displayCourseDetails() from OnlineCourse
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

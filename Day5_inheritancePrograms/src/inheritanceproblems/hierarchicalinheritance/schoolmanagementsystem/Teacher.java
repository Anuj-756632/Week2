package inheritanceproblems.hierarchicalinheritance.schoolmanagementsystem;

class Teacher extends Person {
    private String subject;

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age); // Calling the constructor of the superclass (Person)
        this.subject = subject;
    }

    // Getter method for subject
    public String getSubject() {
        return subject;
    }

    // Overridden method to display role for Teacher
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Teaches: " + subject);
    }
}

package inheritanceproblems.hierarchicalinheritance.hotelmanagement;

class Student extends Person {
    private String grade;

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age); // Calling the constructor of the superclass (Person)
        this.grade = grade;
    }

    // Getter method for grade
    public String getGrade() {
        return grade;
    }

    // Overridden method to display role for Student
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

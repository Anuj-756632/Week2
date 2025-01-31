package inheritanceproblems.hierarchicalinheritance.schoolmanagementsystem;

class Person {
    private String name;
    private int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for Person
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display common details for all persons
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to be overridden in subclasses to describe the role
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

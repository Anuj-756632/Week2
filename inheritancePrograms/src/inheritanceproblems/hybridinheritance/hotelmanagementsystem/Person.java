package inheritanceproblems.hybridinheritance;

class Person {
    private String name;
    private int id;

    // Constructor for Person
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods for Person
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

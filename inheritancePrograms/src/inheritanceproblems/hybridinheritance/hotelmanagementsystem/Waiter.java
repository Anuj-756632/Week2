package inheritanceproblems.hybridinheritance;

class Waiter extends Person implements Worker {
    private String section;

    // Constructor for Waiter
    public Waiter(String name, int id, String section) {
        super(name, id); // Calling the constructor of the superclass (Person)
        this.section = section;
    }

    // Getter method for section
    public String getSection() {
        return section;
    }

    // Overridden method from Worker interface
    @Override
    public void performDuties() {
        System.out.println("The waiter is serving customers in the " + section + " section.");
    }

    // Overridden method to display role-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Section: " + section);
    }
}

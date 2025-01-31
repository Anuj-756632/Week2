package inheritanceproblems.hybridinheritance;

class Chef extends Person implements Worker {
    private String specialty;

    // Constructor for Chef
    public Chef(String name, int id, String specialty) {
        super(name, id); // Calling the constructor of the superclass (Person)
        this.specialty = specialty;
    }

    // Getter method for specialty
    public String getSpecialty() {
        return specialty;
    }

    // Overridden method from Worker interface
    @Override
    public void performDuties() {
        System.out.println("The chef is preparing delicious " + specialty + "!");
    }

    // Overridden method to display role-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}

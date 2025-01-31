package inheritanceproblems.hybridinheritance.hotelmanagementsystem;

public class UsePerson {
    public static void main(String[] args) {
    // Creating instances of Chef and Waiter
    Chef chef = new Chef("Gordon Ramsay", 101, "Beef Wellington");
    Waiter waiter = new Waiter("Alice", 102, "North Wing");

    // Displaying the details and duties for each person
    System.out.println("=== Chef ===");
    chef.displayDetails();
    chef.performDuties();

    System.out.println("\n=== Waiter ===");
    waiter.displayDetails();
    waiter.performDuties();
}
}

package inheritanceproblems.hybridinheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity; // in liters

    // Constructor for PetrolVehicle
    public PetrolVehicle(String model, int maxSpeed, double fuelCapacity) {
        super(model, maxSpeed); // Calling the constructor of the superclass (Vehicle)
        this.fuelCapacity = fuelCapacity;
    }

    // Getter method for fuelCapacity
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    // Overridden method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    // Overridden method to display details for PetrolVehicle
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}


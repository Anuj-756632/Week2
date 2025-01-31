package inheritanceproblems.hybridinheritance.vehiclemanagementsystem;

class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Constructor for ElectricVehicle
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Calling the constructor of the superclass (Vehicle)
        this.batteryCapacity = batteryCapacity;
    }

    // Getter method for batteryCapacity
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    // Overridden method to display details for ElectricVehicle
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

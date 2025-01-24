public class Vehicle {
    // Static variable shared by all vehicles
    static double registrationFee = 500.0;  // Common registration fee for all vehicles
    
    // Final variable for registrationNumber (ensures it cannot be changed once assigned)
    private final String registrationNumber;
    
    // Instance variables for vehicle details
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize ownerName, vehicleType, and registrationNumber
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Method to display vehicle registration details if the object is an instance of Vehicle class
    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Vehicle Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("This is not a valid Vehicle object.");
        }
    }

    // Getter methods for vehicle details
    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "V12345");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "V12346");

        // Displaying vehicle registration details
        vehicle1.displayRegistrationDetails(vehicle1);
        vehicle2.displayRegistrationDetails(vehicle2);

        // Updating the registration fee
        Vehicle.updateRegistrationFee(600.0);

        // Displaying vehicle registration details after updating the fee
        vehicle1.displayRegistrationDetails(vehicle1);
        vehicle2.displayRegistrationDetails(vehicle2);
    }
}

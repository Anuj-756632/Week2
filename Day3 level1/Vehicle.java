public class Vehicle {
    // Static variable to store the registration fee shared across all vehicles
    static double registrationFee = 100.0;

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Instance variables
    String ownerName;
    String vehicleType;
    final String registrationNumber;  // final variable to ensure registration number is unique and cannot be changed

    // Constructor to initialize ownerName, vehicleType, and registrationNumber
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails(Object obj) {
        // Check if the object is an instance of Vehicle before displaying details
        if (obj instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("This is not a valid vehicle object.");
        }
    }

    public static void main(String[] args) {
        // Create some vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "XYZ789");

        // Display registration details for both vehicles
        vehicle1.displayRegistrationDetails(vehicle1);
        vehicle2.displayRegistrationDetails(vehicle2);

        // Update registration fee using static method
        Vehicle.updateRegistrationFee(120.0);

        // Display updated registration details
        vehicle1.displayRegistrationDetails(vehicle1);
        vehicle2.displayRegistrationDetails(vehicle2);

        // Try to call the display method with an invalid object
        String notAVehicle = "This is not a vehicle.";
        vehicle1.displayRegistrationDetails(notAVehicle);
    }
}

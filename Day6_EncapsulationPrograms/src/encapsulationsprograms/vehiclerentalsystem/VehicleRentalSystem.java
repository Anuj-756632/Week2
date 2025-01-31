package encapsulationsprograms.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("C123", 50.00, "INS12345");
        Vehicle bike = new Bike("B456", 30.00, "INS67890");
        Vehicle truck = new Truck("T789", 100.00, "INS11223");

        // Store vehicles in a list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Calculate rental and insurance costs for each vehicle
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNo());
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: $" + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println("Insurance Cost: $" + insurableVehicle.calculateInsurance());
                System.out.println("Insurance Details: " + insurableVehicle.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}


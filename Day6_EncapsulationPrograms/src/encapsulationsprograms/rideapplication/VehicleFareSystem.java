package encapsulationsprograms.rideapplication;

import sun.util.resources.cldr.sr.CalendarData_sr_Latn_RS;

import java.util.ArrayList;
import java.util.List;

public class VehicleFareSystem {
    public static void main(String[] args) {
        // Creating vehicle instances
        Vehicle car = new Car("C001", "Alice", 2.5, "New York");
        Vehicle bike = new Bike("B001", "Bob", 1.0, "San Francisco");
        Vehicle auto = new Auto("A001", "Charlie", 1.5, 3.0, "Los Angeles");

        // List of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Demonstrating polymorphism: calculating fare for each vehicle
        double totalFare = 0;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            double distance = 10;  // Example distance for fare calculation
            double fare = vehicle.calculateFare(distance);
            System.out.println("Fare for " + vehicle.getClass().getSimpleName() + ": " + fare);
            totalFare += fare;
            System.out.println();
        }

        // Displaying total fare
        System.out.println("Total Fare for All Vehicles: " + totalFare);

    }
}


package inheritanceproblems.hybridinheritance;

public class UseVehicle {
    public static void main(String[] args) {
        // Creating instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle electricCar = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle petrolCar = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Displaying the details and specific actions for each vehicle
        System.out.println("=== Electric Vehicle ===");
        electricCar.displayDetails();
        electricCar.charge();  // Electric vehicle specific behavior

        System.out.println("\n=== Petrol Vehicle ===");
        petrolCar.displayDetails();
        petrolCar.refuel();  // Petrol vehicle specific behavior
    }
}

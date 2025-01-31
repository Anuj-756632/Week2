package inheritanceproblems.assestedproblems.transportmanagementsystem;

public class UseVehicle {
    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[3];

        // Store different subclass objects in the array
        vehicles[0] = new Car("Honda",120,"petrol",5);
        vehicles[1] = new MoterCycle("Hero",100,"petrol");
        vehicles[2] = new Truck("Mini Truck",160,"desiel");

        // Call displayInfo() on each vehicle in the array
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("\n");
        }
    }
}

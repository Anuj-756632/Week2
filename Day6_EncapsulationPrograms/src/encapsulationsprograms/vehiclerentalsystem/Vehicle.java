package encapsulationsprograms.vehiclerentalsystem;

public abstract class Vehicle {
    private String vehicleNo;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNo, String type, double rentalRate) {
        this.vehicleNo = vehicleNo;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }
}

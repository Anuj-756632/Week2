package encapsulationsprograms.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() * 1.5; // Trucks have higher rental rates
    }

    @Override
    public double calculateInsurance() {
        return 300.00; // Example calculation
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber + " | Type: Full Coverage";
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
}

package encapsulationsprograms.rideapplication;

class Auto extends Vehicle implements GPS{
    private double surcharge;
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, double surcharge,String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.surcharge = surcharge;
        this.currentLocation=currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        double fare = getRatePerKm() * distance;
        if (distance < 2) {
            fare += surcharge;  // Apply surcharge for short distances
        }
        return fare;
    }

    // Getter for surcharge
    public double getSurcharge() {
        return surcharge;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

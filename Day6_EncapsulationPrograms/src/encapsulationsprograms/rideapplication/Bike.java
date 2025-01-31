package encapsulationsprograms.rideapplication;

class Bike extends Vehicle implements GPS{
    String currentLocation;
    public Bike(String vehicleId, String driverName, double ratePerKm,String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation=currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;  // Simple fare calculation for Bike
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

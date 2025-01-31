package inheritanceproblems.hybridinheritance.vehiclemanagementsystem;

class Vehicle {
    private String model;
    private int maxSpeed;

    // Constructor for Vehicle
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Getter methods for Vehicle
    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

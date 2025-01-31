package inheritanceproblems.singleinheritance.smarthomedevices;

class Device {
    private String deviceId;
    private String status;

    // Constructor for Device
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display general device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

package inheritanceproblems.singleinheritance.smarthomedevices;

public class UseDevice {
    public static void main(String[] args) {
        // Creating an instance of Thermostat
        Thermostat thermostat = new Thermostat("T1001", "On", 22);

        // Displaying status of the thermostat (which is also a Device)
        thermostat.displayStatus();
    }
}

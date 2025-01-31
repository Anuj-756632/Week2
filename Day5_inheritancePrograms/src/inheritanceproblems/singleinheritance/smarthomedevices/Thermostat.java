package inheritanceproblems.singleinheritance.smarthomedevices;

public class Thermostat extends Device {
    private int temperatureSetting;
    public Thermostat(String deviceId,String status,int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    public int getTemeratureSetting(){
        return temperatureSetting;
    }


    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

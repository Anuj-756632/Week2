package inheritanceproblems.assestedproblems.transportmanagementsystem;

public class Truck extends Vehicle {
    String type;
    public Truck(String type,float maxSpeed,String fuilType){
        super(maxSpeed,fuilType);
        this.type=type;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Details");
        System.out.println("Type of truck: "+type);
        super.displayDetails();
    }
}

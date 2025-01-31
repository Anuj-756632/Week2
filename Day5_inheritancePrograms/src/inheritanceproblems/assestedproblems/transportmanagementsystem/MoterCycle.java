package inheritanceproblems.assestedproblems.transportmanagementsystem;

public class MoterCycle extends Vehicle {
    String model;
    public MoterCycle(String model,float maxSpeed,String fuilType){
        super(maxSpeed,fuilType);
        this.model=model;
    }

    @Override
    public void displayDetails() {
        System.out.println("MoterCycle Details");
        System.out.println("Model: "+model);
        super.displayDetails();
    }
}

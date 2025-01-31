package inheritanceproblems.assestedproblems.transportmanagementsystem;

public class Vehicle {
    float maxSpeed;
    String fuilType;
    public Vehicle(float maxSpeed,String fuilType){
        this.maxSpeed=maxSpeed;
        this.fuilType=fuilType;
    }
    public void displayDetails(){
        System.out.println("Max Speed: "+maxSpeed+"\nFuil Type: "+fuilType);
    }
}

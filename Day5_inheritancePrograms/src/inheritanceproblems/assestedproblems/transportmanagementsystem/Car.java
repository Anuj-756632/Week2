package inheritanceproblems.assestedproblems.transportmanagementsystem;

public class Car extends Vehicle {
    int seatCapacity;
    String model;
    public Car(String model,float maxSpeed,String fuilType,int seatCapacity){
        super(maxSpeed,fuilType);
        this.model=model;
        this.seatCapacity=seatCapacity;
    }
    public void displayDetails(){
        System.out.println("Car Details");
        System.out.println("Model Name: "+model+"\nSeat Capacity: "+seatCapacity);
        super.displayDetails();
    }
}

package inheritanceproblems.assestedproblems.employeemanagementSystem;

public class Manager extends Employee {
    int teamSize;
    public Manager(String name,String id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Details");
        super.displayDetails();
        System.out.println("Member in Team is: "+teamSize);
    }
}

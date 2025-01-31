package inheritanceproblems.assestedproblems;

public class Intern extends Employee {
    public Intern(String name,String id,double salary){
        super(name, id, salary);
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern Details");
        super.displayDetails();
    }
}

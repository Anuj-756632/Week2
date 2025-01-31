package inheritanceproblems.assestedproblems;

public class Employee {
    String name;
    String id;
    double salary;
    public Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Employee name: "+name+"\nId: "+id+"\nSalary: "+salary);
    }
}
package encapsulationsprograms.employeemanagementsystem;

public abstract class Employee {
    String employeeId;
    String name;
    double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract  double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee name: "+name+"\nEmployeeId: "+employeeId+"\nBase Salary: "+baseSalary);
    }
}

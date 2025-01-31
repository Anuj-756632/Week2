package encapsulationsprograms.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department{
    String department;
    int workHours=5;
    public PartTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part time employee details");
        super.displayDetails();
        System.out.println("work Hours: "+workHours);
    }
    public void assignDepartment(String department){
        this.department=department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

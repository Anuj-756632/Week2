package encapsulationsprograms.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department{
    String department;
    int workperHours;
    public FullTimeEmployee(String employeeId,String name,double baseSalary) {
        super(employeeId,name,baseSalary);
    }
    public void setWorkperHours(int workperHours){
        this.workperHours=workperHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary*workperHours;

    }
    public void displayDetails(){
        System.out.println("Full time employee details");
        super.displayDetails();
        System.out.println("Salary: "+calculateSalary());
        System.out.println("Department name: "+getDepartmentDetails());
    }
    public void assignDepartment(String department){
        this.department=department;
    }
    public String getDepartmentDetails(){
        return department;
    }
}

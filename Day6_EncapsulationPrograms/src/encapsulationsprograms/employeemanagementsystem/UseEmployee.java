package encapsulationsprograms.employeemanagementsystem;
import java.util.List;
import java.util.ArrayList;
public class UseEmployee {
    public static void main(String[] args){
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new FullTimeEmployee("123","Anuj",200000));
        FullTimeEmployee employee1=new FullTimeEmployee("321","anuj",100000);
        employee1.assignDepartment("HR");
        employee1.setWorkperHours(20);
        employee1.displayDetails();
    }
}

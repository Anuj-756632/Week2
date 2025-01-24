import java.util.Scanner;
class Employee
{
	private String name; 
	private String id;
	private double salary;
	Employee(String name, String id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void display(){
		System.out.println("Employee name: "+name+"\nEmployee Id: "+id+"\nEmployee Salary: "+salary);
	}
		
	}
public class UseEmployee{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter Employee name: ");
			String name=sc.nextLine();

			System.out.println("Enter Employee Id: ");
			String id=sc.next();

			System.out.println("Enter Employee Salary: ");
			double salary=sc.nextDouble();
			
			Employee employee=new Employee(name,id,salary);
			employee.display();
		}
}
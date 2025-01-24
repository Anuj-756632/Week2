import java.util.Scanner;
class Person{
		private String name;
		private String address;
		private String mobNo;
		public Person(){
				this.name="Anuj Vishwakarma";
				this.address="Gupta colony";
				this.mobNo="9691650414";
		}
		public Person(String name,String address,String mobNo){
				this.name=name;
				this.address=address;
				this.mobNo=mobNo;
		}
		public Person(Person another){
				System.out.println("Copy Constructor Called ");
				name=another.name;
				address=another.address;
				mobNo=another.mobNo;
		}
		public void personDetails(){
				System.out.println("Person name is: "+name+"\nAddress: "+address+"\n mobNo: "+mobNo);
		}
}
public class PersonMain{
		public static void main(String[] args){
				Scanner sc=new Scanner (System.in);
				System.out.println("Enter name of the person");
				String name=sc.nextLine();
				
				System.out.println("Enter the Address");
				String address=sc.nextLine();
				
				System.out.println("Enter Mobile No.");
				String mobNo=sc.nextLine();
				
				Person person1=new Person(name,address,mobNo);
				Person person2=new Person(person1);
				person2.personDetails();
				//person1.personDetails();
		}
}
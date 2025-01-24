import java.util.Scanner;
class CarRental{
		private String customerName;
		private String carModel;
		private int rentalDays;
		
		public CarRental( String customerName,String carModel,int rentalDays){
				this.customerName=customerName;
				this.carModel=carModel;
				this.rentalDays=rentalDays;
		}
		public void rentCar(int pricePerDay){
				System.out.println("Customer Name: "+customerName+"\n Car Model: "+carModel+"\n No.of Days for rent: "+rentalDays+"\n Total Price: "+rentalDays*pricePerDay);
		}
}
public class Renter{
		public static void main(String []args){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Customer Name");
				String customerName=sc.nextLine();
				
				System.out.println("Enter Car Model");
				String carModel=sc.nextLine();
				
				System.out.println("Enter Days for car rent");
				int rentalDays=sc.nextInt();
				
				System.out.println("Enter price for per day");
				int pricePerDay=sc.nextInt();
				CarRental carRental=new CarRental(customerName,carModel,rentalDays);
				carRental.rentCar(pricePerDay);
		}
}
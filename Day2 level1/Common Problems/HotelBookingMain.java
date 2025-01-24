import java.util.Scanner;
class HotelBooking{
		private String guestName;
		private String roomType;
		private int nights;
		public HotelBooking(String guestName, String roomType, int nights){
				this.guestName=guestName;
				this.roomType=roomType;
				this.nights=nights;
		}
		public HotelBooking(HotelBooking customer){
				guestName=customer.guestName;
				roomType=customer.roomType;
				nights=customer.nights;
		}
		public void displayBookingDetails(){
				System.out.println("Guest Name is: "+guestName+"\n Room type is: "+roomType+"\n No. of nights: "+nights);
		}
}
public class HotelBookingMain{
		public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				 
				System.out.println("Enter guest name");
				String guestName=sc.nextLine();
				
				System.out.println("Enter Room Type");
				String roomType=sc.nextLine();
				
				System.out.println("Enter nights");
				int nights=sc.nextInt();
				
				HotelBooking hotelBooking=new HotelBooking(guestName,roomType,nights);
				HotelBooking hotelBooking2=new HotelBooking(hotelBooking);
				hotelBooking2.displayBookingDetails();
				
		}
}
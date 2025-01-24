import java.util.Scanner;
class Circle{
	private double radius;
	private double pi=3.14;
	public Circle(double radius){
		this.radius = radius;
	}
	public void Area(){
	 
		System.out.println("Area of the Circle: "+(pi*Math.pow(radius,2))+"\nCircumference of the Circle: "+2*pi*radius);
		
	}
	
}
public class UseCirle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double radius=sc.nextDouble();
		Circle circle=new Circle(radius);	
		circle.Area();
		}
}
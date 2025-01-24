import java.util.Scanner;
class Circle{
    private double radius;
    public Circle(){
        this.radius = 0.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void displayDetails(){
        System.out.println("Radius of the circle is: "+radius);
    }
}
public class CircleMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Radius ");
        double radius = sc.nextDouble();

        Circle circle=new Circle();
        Circle circle2=new Circle(radius);
        circle2.displayDetails();
    }
    
}

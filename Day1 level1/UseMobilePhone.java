import java.util.Scanner;
class MobilePhone{
    private String model;
    private String brand;
    private double price;
    public MobilePhone(String model, String brand, double price){
        this.model = model;
        this.brand = brand;
        this.price = price;
    }
    public void displayMobileDetails(){
        System.out.println("brand: " + brand+"\nmodel: "+model+"\nprice: " + price);
    }
}
public class UseMobilePhone {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);

        System.out.println("Brand name");
        String brand=sc.nextLine();

        System.out.println("Model name");
        String model=sc.nextLine();

        System.out.println("Price");
        double price=sc.nextDouble();
        MobilePhone phone=new MobilePhone(model,brand,price);
        phone.displayMobileDetails();
    }
}

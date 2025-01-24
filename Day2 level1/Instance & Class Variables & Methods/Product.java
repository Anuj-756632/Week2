import java.util.Scanner;
public class Product{
		private String productName;
		private double price;
		private static int totalProducts=0;
		
		public Product(String productName,double price){
				this.productName=productName;
				this.price=price;
				totalProducts++;
		}
		public void displayProductDetails(){
				System.out.println("Product name: "+productName+"\nprice"+price);
		}
		public void displayTotalProducts(){
				System.out.println("Total No of Products: "+totalProducts);
		}
		public static void main(String []args){
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter Product name:");
				String productName=sc.nextLine();
				
				System.out.println("Enter Price");
				double price=sc.nextDouble();
				Product product1=new Product(productName,price);
				// second Product
				Product product2=new Product(productName,price);
				
				product1.displayProductDetails();
				product1.displayTotalProducts();
		}
}
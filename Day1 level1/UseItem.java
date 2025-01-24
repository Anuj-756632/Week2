import java.util.Scanner;
class Item{
    private String itemCode;
    private String itemName;
    private double price;
    public Item(String itemCode, String itemName,double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void displayItemDetails(){
        System.out.println("Item Name: "+itemName+" \nItem Code: "+itemCode+" \nPrice: "+price);
    }
}
public class UseItem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Item Name");
        String itemName=sc.nextLine();

        System.out.println("Enter Item Code");
        String itemCode=sc.next();
        
        System.out.println("Enter Item Price");
        double Price=sc.nextDouble();
        Item item=new Item(itemCode,itemName,Price);
        item.displayItemDetails();
    }
    
}

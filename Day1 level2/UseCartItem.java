import java.util.Scanner;
class CartItem {
    // Attributes of the CartItem class
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize the cart item
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item to the cart (update quantity)
    public void addItem(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    // Method to remove an item from the cart (reduce quantity)
    public void removeItem(int quantityToRemove) {
        if (this.quantity >= quantityToRemove) {
            this.quantity -= quantityToRemove;
        } else {
            System.out.println("Error: Not enough quantity to remove.");
        }
    }

    // Method to calculate and display the total cost of the item
    public double getTotalCost() {
        return this.price * this.quantity;
    }

    // Method to display the details of the cart item
    public void displayItemDetails() {
        System.out.println("Item: " + this.itemName);
        System.out.println("Price: $" + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Total Cost: $" + getTotalCost());
    }
}
public class UseCartItem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item name");
        String itemName = sc.nextLine();

        System.out.println("Enter the item price");
        double price = sc.nextDouble();

        System.out.println("Enter the item quantity");
        int quantity = sc.nextInt();
        // Create a CartItem object (add a new item to the cart)
        CartItem item1 = new CartItem(itemName,price,quantity);

        // Display item details
        item1.displayItemDetails();

        // Add 2 more laptops to the cart
        item1.addItem(2);
        System.out.println("\nAfter adding 2 more laptops:");
        item1.displayItemDetails();

        // Remove 1 laptop from the cart
        item1.removeItem(1);
        System.out.println("\nAfter removing 1 laptop:");
        item1.displayItemDetails();

        // Try to remove more than the available quantity
        item1.removeItem(3); // This should show an error message
    }
}

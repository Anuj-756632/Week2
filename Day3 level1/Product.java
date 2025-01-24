public class Product {
    // Static variable: shared across all products
    static double discount = 10.0;  // Discount percentage for all products
    
    // Final variable: productID cannot be changed once assigned
    final int productID;
    
    // Instance variables
    String productName;
    double price;
    int quantity;

    // Constructor to initialize product details
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;  // Product ID is final, so it can only be assigned once
    }

    // Static method to update the discount for all products
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) {  // Checking if the object is an instance of Product
            double totalPrice = price * quantity * (1 - discount / 100);
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price (after discount): $" + totalPrice);
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create some product instances
        Product product1 = new Product("Laptop", 999.99, 2, 101);
        Product product2 = new Product("Smartphone", 499.99, 3, 102);
        Product product3 = new Product("Headphones", 89.99, 5, 103);

        // Display product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Update the discount and display product details again
        Product.updateDiscount(15.0);  // Updating discount to 15%
        System.out.println("\nUpdated Discount:");
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
    }
}

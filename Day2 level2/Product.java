public class Product {
    // Static variable shared by all products
    static double discount = 10.0; // Discount percentage (e.g., 10%)
    
    // Final variable for productID (ensures the product ID cannot be changed once assigned)
    private final String productID;
    
    // Instance variables for product details
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to display product details if the object is an instance of Product class
    public void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Discounted Price: $" + discountedPrice);
        } else {
            System.out.println("This is not a valid Product object.");
        }
    }

    // Getter methods for product details
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductID() {
        return productID;
    }

    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 1000.00, 2, "P001");
        Product product2 = new Product("Smartphone", 800.00, 5, "P002");

        // Displaying product details before updating discount
        product1.displayProductDetails(product1);
        product2.displayProductDetails(product2);

        // Updating discount percentage using static method
        Product.updateDiscount(15.0);

        // Displaying product details after updating discount
        product1.displayProductDetails(product1);
        product2.displayProductDetails(product2);
    }
}

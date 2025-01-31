package encapsulationsprograms.ecommerceplatformsystem;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementSystem {
    public static void main(String[] args) {
        // Create instances of products
        Electronics electronics = new Electronics("102", "Laptop", 1000.00, 10);
        Clothing clothing = new Clothing("103", "T-shirt", 50.00, 20);
        Groceries groceries = new Groceries("104", "Apple", 2.00, 5);

        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(electronics);
        products.add(clothing);
        products.add(groceries);

        // Calculate and print the final price for each product (Price + Tax - Discount)
        System.out.println("Final Price for Each Product:");
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() - discount;

            // Check if the product is taxable (implements Taxable)
            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                double tax = taxableProduct.calculateTax();
                finalPrice += tax;
                System.out.println(product.getName() + ": Final Price = " + finalPrice + " (Price = " + product.getPrice() + ", Tax = " + tax + ", Discount = " + discount + ")");
            } else {
                // No tax for non-taxable products
                System.out.println(product.getName() + ": Final Price = " + finalPrice + " (Price = " + product.getPrice() + ", Discount = " + discount + ")");
            }
        }
    }
}


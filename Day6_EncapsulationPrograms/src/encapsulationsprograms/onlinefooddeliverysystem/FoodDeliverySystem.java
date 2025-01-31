package encapsulationsprograms.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create food items
        FoodItem vegItem1 = new DiscountableVegItem("Vegetable Pizza", 10.00, 2, 10);  // 10% discount

        FoodItem vegItem2 = new VegItem("Pasta", 8.50, 3);

        // List to store the food items
        List<FoodItem> orderItems = new ArrayList<>();
        orderItems.add(vegItem1);
        orderItems.add(vegItem2);

        // Process each food item: get details, calculate total price, and apply discounts
        double totalOrderPrice = 0;
        for (FoodItem item : orderItems) {
            System.out.println(item.getItemDetails());
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price (before discount): $" + totalPrice);

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                double discountAmount = discountableItem.applyDiscount();
                System.out.println("Discount Applied: -$" + discountAmount);
                totalPrice -= discountAmount;
                System.out.println(discountableItem.getDiscountDetails());
            }

            System.out.println("Total Price (after discount): $" + totalPrice);
            totalOrderPrice += totalPrice;
            System.out.println();
        }

        System.out.println("Total Order Price: $" + totalOrderPrice);
    }
}


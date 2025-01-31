
package inheritanceproblems.multilevelinheritance.onlineordermanagementsystem;

public class UseOrder {
    public static void main(String[] args) {
        // Creating instances of each order type
        Order order = new Order("O123", "2025-01-01");
        ShippedOrder shippedOrder = new ShippedOrder("O124", "2025-01-02", "T123456");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O125", "2025-01-03", "T654321", "2025-01-10");

        // Displaying the status of each order
        System.out.println("Order ID: " + order.getOrderId() + ", Status: " + order.getOrderStatus());
        System.out.println("Order ID: " + shippedOrder.getOrderId() + ", Status: " + shippedOrder.getOrderStatus());
        System.out.println("Order ID: " + deliveredOrder.getOrderId() + ", Status: " + deliveredOrder.getOrderStatus());
    }
}

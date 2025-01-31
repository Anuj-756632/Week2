package inheritanceproblems.multilevelinheritance.onlineordermanagementsystem;

class Order {
    private String orderId;
    private String orderDate;

    // Constructor for Order
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Getter methods for Order
    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed";
    }
}

package inheritanceproblems.multilevelinheritance;

class ShippedOrder extends Order {
    private String trackingNumber;

    // Constructor for ShippedOrder
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Calling the constructor of the superclass (Order)
        this.trackingNumber = trackingNumber;
    }

    // Getter method for trackingNumber
    public String getTrackingNumber() {
        return trackingNumber;
    }

    // Overridden method to get order status for shipped order
    @Override
    public String getOrderStatus() {
        return "Order shipped, Tracking Number: " + trackingNumber;
    }
}

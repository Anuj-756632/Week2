package inheritanceproblems.multilevelinheritance.onlineordermanagementsystem;

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor for DeliveredOrder
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Calling the constructor of the superclass (ShippedOrder)
        this.deliveryDate = deliveryDate;
    }

    // Getter method for deliveryDate
    public String getDeliveryDate() {
        return deliveryDate;
    }

    // Overridden method to get order status for delivered order
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

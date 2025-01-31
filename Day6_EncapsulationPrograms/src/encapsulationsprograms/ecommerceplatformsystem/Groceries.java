package encapsulationsprograms.ecommerceplatformsystem;

class Groceries extends Product {
    private double discountRate; // Discount rate for groceries

    // Constructor for Groceries
    public Groceries(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    // Calculate discount for Groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }
}


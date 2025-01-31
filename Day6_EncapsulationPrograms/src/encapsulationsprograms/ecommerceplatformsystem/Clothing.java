package encapsulationsprograms.ecommerceplatformsystem;

class Clothing extends Product implements Taxable {
    private double discountRate; // Discount rate for clothing

    // Constructor for Clothing
    public Clothing(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    // Calculate discount for Clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    // Implementing methods from Taxable interface
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;  // Clothing has a tax rate of 12%
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: 12%";
    }
}


package encapsulationsprograms.onlinefooddeliverysystem;

class DiscountableVegItem extends VegItem implements Discountable {
    private double discountPercentage;  // Discount percentage for veg items

    public DiscountableVegItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "% off";
    }
}




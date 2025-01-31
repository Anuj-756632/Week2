package encapsulationsprograms.onlinefooddeliverysystem;

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();  // No extra charge for veg items
    }
}

package encapsulationsprograms.ecommerceplatformsystem;

public class Electronics extends Product implements Taxable{
    private double discountRate;

    public Electronics(String productId, String name, double price,double discountRate) {
        super(productId, name, price);
        this.discountRate=discountRate;
    }

    @Override
    public double calculateDiscount() {
        return price*discountRate/100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: 18%";
    }
}

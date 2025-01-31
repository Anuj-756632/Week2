package encapsulationsprograms.ecommerceplatformsystem;

public abstract class Product {
    String productId;
    String name;
    double price;
    public Product(String productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    public abstract double calculateDiscount();

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}

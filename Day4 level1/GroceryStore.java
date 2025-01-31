class Product{
    private String name;
    private double pricePerUnit;
    private int quantity;
    public Product(String name,double pricePerUnit,int quantity){
        this.name=name;
        this.pricePerUnit=pricePerUnit;
        this.quantity=quantity;
    }
    public String getName(){
        return name;
    }
    public double getPricePerUnit(){
        return pricePerUnit;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotalPrice(){
        return pricePerUnit*quantity;
    }

}
class Customer{
    private String name;
    private Product []products;
    private int productCount;
    public Customer(String name,int maxProducts){
        this.name=name;
        this.products=new Product[maxProducts];
        this.productCount=0;
    }
    public void addProduct(Product product){
        if(productCount<products.length){
            products[productCount++]=product;

        }else{
            System.out.println("Maximum limit exeed ");
        }
    }
    public String getName(){
        return name;
    }
    public Product[] getProduct(){
        return products;
    }
    public int getProductCount(){
        return productCount;
    }

}

class BillGenerator{
    public float computeTotal(Customer customer){
        float total=0;
        Product[] products=customer.getProduct();
        for(int i=0;i<customer.getProductCount();i++){
            total+=products[i].getTotalPrice();
        }
        return total;
    }
}
public class GroceryStore{
    public static void main(String[] args){
        Customer customer=new Customer("Anuj",5);
        customer.addProduct(new Product("Banana",3,2));
        customer.addProduct(new Product("Mango",5,8));
        BillGenerator billGenerator=new BillGenerator();
        double totalBill=billGenerator.computeTotal(customer);
        System.out.println("Customer: "+customer.getName());
        for(int i=0;i<customer.getProductCount();i++){
            Product product=customer.getProduct()[i];
            System.out.println(product.getName()+": "+product.getQuantity()+" units "+product.getPricePerUnit()+" each");
        }
        System.out.println("Total Bill; "+totalBill);
    }
}
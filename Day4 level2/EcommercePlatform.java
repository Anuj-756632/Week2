public class Product {
    private String name;
    private double price;

    // Constructor to initialize a product
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Get the name of the product
    public String getName() {
        return name;
    }

    // Get the price of the product
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

//order class
public class Order {
    private static int orderCounter = 0;
    private int orderId;
    private List<Product> products;
    private Customer customer;

    // Constructor to initialize an order
    public Order(Customer customer) {
        this.orderId = ++orderCounter;
        this.products = new ArrayList<>();
        this.customer = customer;
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Get the order ID
    public int getOrderId() {
        return orderId;
    }

    // Get the total price of the order
    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("  " + product);
        }
        System.out.println("Total Price: $" + getTotalPrice());
    }
}

//Customer class
public class Customer {
    private String name;
    private List<Order> orders;

    // Constructor to initialize a customer
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Get the name of the customer
    public String getName() {
        return name;
    }

    // Place an order
    public Order placeOrder() {
        Order order = new Order(this);
        orders.add(order);
        return order;
    }

    // Display all orders placed by the customer
    public void displayOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
            System.out.println();
        }
    }
}

//main class
public class EcommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Headphones", 89.99);

        // Create customer
        Customer customer1 = new Customer("John Doe");

        // Customer places an order
        Order order1 = customer1.placeOrder();

        // Add products to the order
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places another order
        Order order2 = customer1.placeOrder();

        // Add products to the second order
        order2.addProduct(product3);

        // Display all orders placed by the customer
        customer1.displayOrders();
    }
}

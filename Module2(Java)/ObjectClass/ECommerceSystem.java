import java.util.ArrayList;

// Custom Exception
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

// Product Class
class Product {
    private String productName;
    private double price;
    private int stockQuantity;

    // Parameterized Constructor
    public Product(String productName, double price, int stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters & Setters
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // For displaying product details
    @Override
    public String toString() {
        return "Product: " + productName + ", Price: " + price + ", Stock: " + stockQuantity;
    }
}

// Store Class
class Store {
    private ArrayList<Product> productList;

    // Constructor
    public Store() {
        productList = new ArrayList<>();
    }

    // Add product
    public void addProduct(Product p) {
        productList.add(p);
    }

    // Purchase product
    public void purchaseProduct(String productName, int quantity) throws OutOfStockException {
        for (Product p : productList) {
            if (p.getProductName().equalsIgnoreCase(productName)) {
                if (quantity > p.getStockQuantity()) {
                    throw new OutOfStockException("Not enough stock available for " + productName);
                } else {
                    p.setStockQuantity(p.getStockQuantity() - quantity);
                    System.out.println("Successfully purchased " + quantity + " of " + productName);
                    return;
                }
            }
        }
        System.out.println("Product not found: " + productName);
    }

    // Display products
    public void displayProducts() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}

// Main Class
public class ECommerceSystem {
    public static void main(String[] args) {
        // Create store
        Store store = new Store();

        // Add products
        store.addProduct(new Product("Laptop", 55000.0, 5));
        store.addProduct(new Product("Smartphone", 25000.0, 10));
        store.addProduct(new Product("Headphones", 1500.0, 20));

        // Display all products
        System.out.println("Available Products:");
        store.displayProducts();

        // Try to purchase product with more than available stock
        try {
            System.out.println("\nAttempting to purchase 8 Laptops...");
            store.purchaseProduct("Laptop", 8);
        } catch (OutOfStockException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // Display products after purchase attempt
        System.out.println("\nProducts after purchase attempt:");
        store.displayProducts();
    }
}

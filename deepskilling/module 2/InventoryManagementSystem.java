import java.util.HashMap;

class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        return "ID: " + productId +
               ", Name: " + productName +
               ", Price: " + price +
               ", Quantity: " + quantity;
    }
}

class Inventory {
    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product p) {
        if(products.containsKey(p.getProductId())) {
            System.out.println("Product ID already exists!");
        } else {
            products.put(p.getProductId(), p);
            System.out.println("Product added successfully.");
        }
    }

    public void updateProduct(int productId, String name,
                              double price, int quantity) {

        if(products.containsKey(productId)) {
            Product p = products.get(productId);

            p.setProductName(name);
            p.setPrice(price);
            p.setQuantity(quantity);

            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if(products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProducts() {
        if(products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for(Product p : products.values()) {
            System.out.println(p);
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 50000, 10);
        Product p2 = new Product(102, "Mouse", 500, 50);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayProducts();

        inventory.updateProduct(101, "Laptop", 48000, 12);

        inventory.deleteProduct(102);

        System.out.println("\nAfter Update and Delete:");
        inventory.displayProducts();
    }
}
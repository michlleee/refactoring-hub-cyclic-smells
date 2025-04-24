package solutions;

public class Product {
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + productName);
    }
}

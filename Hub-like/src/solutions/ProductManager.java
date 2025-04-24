package solutions;

public class ProductManager {
    private Product product;

    public ProductManager(String productName) {
        this.product = new Product(productName);
    }

    public void displayProductInfo() {
        product.displayProductInfo();
    }
}

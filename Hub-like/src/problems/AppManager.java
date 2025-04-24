package problems;

public class AppManager { // main hub with a bunch of responsibilities
    private User user;
    private Product product;

    public AppManager() {
        this.user = new User("John Doe");
        this.product = new Product("Java Book");
    }

    public void displayAllInfo() {
        user.displayUserInfo();        // depends directly on class User
        product.displayProductInfo();  // depends directly on class Product
    }
}

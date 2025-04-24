package solutions;

public class AppManager {
    private UserManager userManager;
    private ProductManager productManager;

    public AppManager(String userName, String productName) {
        this.userManager = new UserManager(userName);
        this.productManager = new ProductManager(productName);
    }

    public void displayAllInfo() {
        userManager.displayUserInfo();
        productManager.displayProductInfo();
    }
}

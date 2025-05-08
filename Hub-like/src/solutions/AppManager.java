package solutions;

public class AppManager {
	private User user;
    private ProductManager productManager;

    public AppManager(String userName) {
        this.user = new User(userName);
    }

    public void displayAllInfo() {
        user.displayUserInfo();
        productManager.displayProductBrands();
    }
    
    public ProductManager getProductManager() {
        return productManager;
    }
}

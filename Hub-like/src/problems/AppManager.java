package problems;

public class AppManager {
    private User user;
    private Milk milk;
    private Coffee coffee;

    public AppManager() {
        this.user = new User("John Doe");
        this.milk = new Milk("IndoMilk");
        this.coffee = new Coffee("Kapal Api");
    }

    public void displayAllInfo() {
        user.displayUserInfo();       
        displayProductBrands();
    }
    
    public void displayProductBrands() {
    	milk.displayMilkBrand();
    	coffee.displayCoffeeBrand();
    }

    public void registerProduct(String productName) {
        System.out.println("Registered product: " + productName);
    }
}
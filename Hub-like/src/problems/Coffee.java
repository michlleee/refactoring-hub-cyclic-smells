package problems;

public class Coffee {
	private String productBrand;

    public Coffee(String productBrand) {
        this.productBrand = productBrand;
    }

    public void register() {
        AppManager am = new AppManager();
        am.registerProduct(productBrand);
    }
    
    public void displayCoffeeBrand() {
    	System.out.println("Coffee brand: " + productBrand);
    }
}
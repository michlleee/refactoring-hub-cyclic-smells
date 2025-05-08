package problems;

public class Milk {
	private String productBrand;

    public Milk(String productBrand) {
        this.productBrand = productBrand;
    }

    public void register() {
        AppManager am = new AppManager();
        am.registerProduct(productBrand);
    }
    
    public void displayMilkBrand() {
    	System.out.println("Milk brand: " + productBrand);
    }
}
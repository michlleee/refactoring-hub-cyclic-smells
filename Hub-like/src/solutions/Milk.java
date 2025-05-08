package solutions;

public class Milk {
	private String productBrand;

    public Milk(String productBrand) {
        this.productBrand = productBrand;
    }
    
    public void register() {
        ProductManager pm = new ProductManager();
        pm.registerProduct(productBrand);
    }
    
    public void displayMilkBrand() {
    	System.out.println("Milk brand: " + productBrand);
    }
}

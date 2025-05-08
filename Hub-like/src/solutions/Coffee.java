package solutions;

public class Coffee {
	private String productBrand;

    public Coffee(String productBrand) {
        this.productBrand = productBrand;
    }
    
    public void register() {
        ProductManager pm = new ProductManager();
        pm.registerProduct(productBrand);
    }
    
    public void displayCoffeeBrand() {
    	System.out.println("Milk brand: " + productBrand);
    }
}

package solutions;

public class ProductManager {
    private Milk milk;
    private Coffee coffee;
    
    public void displayProductBrands() {
    	milk.displayMilkBrand();
    	coffee.displayCoffeeBrand();
    }
    
    public void registerProduct(String productName) {
        System.out.println("Registered product: " + productName);
    }
    
    public void createAndRegisterProducts(String milkBrand, String coffeeBrand) {
        milk = new Milk(milkBrand);
        coffee = new Coffee(coffeeBrand);
        
        milk.register();
        coffee.register();
    }
    
}

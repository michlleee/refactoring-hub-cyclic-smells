package solutions;

public class MainApp {
    public static void main(String[] args) {
    	AppManager appManager = new AppManager("JohnDoe");
        appManager.getProductManager().createAndRegisterProducts("DairyGold", "Nescafe");

        appManager.displayAllInfo();
    }
}
public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("Utkarsh");

        Observer web = new WebApp("Admin");

        stockMarket.register(mobile);

        stockMarket.register(web);

        stockMarket.setStock("COG", 3850.75);

        System.out.println();

        stockMarket.setStock("COG2", 1625.50);

    }

}
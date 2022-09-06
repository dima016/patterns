package backers.patterns.creational.factory;

public class DemoApp {
    public static void main(String[] args) {
        FoodDeliveryService pizzaDeliveryService = new PizzaDeliveryService();
        pizzaDeliveryService.orderFood("Big Italian Pizza");

        FoodDeliveryService sushiDeliveryService = new SushiDeliveryService();
        sushiDeliveryService.orderFood("Small Sushi Set");
    }
}

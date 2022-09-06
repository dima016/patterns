package backers.patterns.creational.factory;

public class PizzaDeliveryService extends FoodDeliveryService{
    @Override
    public Food cookFood() {
        System.out.println("Pizza is already cooking!");
        return new Pizza();
    }
}

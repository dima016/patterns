package backers.patterns.creational.factory;

public class SushiDeliveryService extends FoodDeliveryService{
    @Override
    public Food cookFood() {
        System.out.println("Sushi is already cooking!");
        return new Sushi();
    }
}
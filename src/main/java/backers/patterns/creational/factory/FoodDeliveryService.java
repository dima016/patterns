package backers.patterns.creational.factory;

public abstract class FoodDeliveryService {

    public Food orderFood(String details) {
        Food food = cookFood();
        food.processOrderDetails(details);
        food.prepare();

        return food;
    }

    abstract Food cookFood();
}

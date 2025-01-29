import builder.Pizza;
import builder.PizzaOrder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = PizzaOrder.createCustomPizza();
        System.out.println("Your order: " + pizza);
    }
}
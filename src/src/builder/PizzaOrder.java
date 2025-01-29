package builder;

import java.util.Arrays;

public class PizzaOrder {
    public static Pizza createCustomPizza() {
        return new Pizza.PizzaBuilder()
                .setSize("Large")
                .setCrust("Thin")
                .setToppings(Arrays.asList("Pepperoni", "Mushrooms", "Olives"))
                .setExtraCheese(true)
                .setExtraSauce(false)
                .build();
    }
}

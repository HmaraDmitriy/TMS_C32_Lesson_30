import builder.Pizza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaAssembly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder();

        System.out.println("Sorry, but at the moment there are no pineapples (always)");
        System.out.println("Make your order from the selection menu");
        System.out.print("Enter pizza size (Small, Medium, Large): ");
        builder.setSize(scanner.nextLine());

        System.out.print("Enter crust type (Thin, Thick, Stuffed): ");
        builder.setCrust(scanner.nextLine());

        System.out.print("Enter toppings (comma separated): ");
        String toppingsInput = scanner.nextLine();
        List<String> toppings = new ArrayList<>();
        if (!toppingsInput.isEmpty()) {
            for (String topping : toppingsInput.split(",")) {
                toppings.add(topping.trim());
            }
        }
        builder.setToppings(toppings);

        System.out.print("Extra cheese? (yes/no): ");
        builder.setExtraCheese(scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.print("Extra sauce? (yes/no): ");
        builder.setExtraSauce(scanner.nextLine().equalsIgnoreCase("yes"));

        Pizza pizza = builder.build();
        System.out.println("Your order: " + pizza);
    }
}

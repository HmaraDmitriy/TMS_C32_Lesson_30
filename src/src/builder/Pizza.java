package builder;

import java.util.List;

public class Pizza {
    private final String size;
    private final String crust;
    private final List<String> toppings;
    private final boolean extraCheese;
    private final boolean extraSauce;

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
        this.extraCheese = builder.extraCheese;
        this.extraSauce = builder.extraSauce;
    }

    public static class PizzaBuilder {
        private String size;
        private String crust;
        private List<String> toppings;
        private boolean extraCheese;
        private boolean extraSauce;

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setCrust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder setToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public PizzaBuilder setExtraSauce(boolean extraSauce) {
            this.extraSauce = extraSauce;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", toppings=" + toppings +
                ", extraCheese=" + extraCheese +
                ", extraSauce=" + extraSauce +
                '}';
    }
}

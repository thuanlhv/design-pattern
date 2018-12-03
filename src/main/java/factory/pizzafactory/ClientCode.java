package factory.pizzafactory;

import java.util.List;

import static java.util.Arrays.asList;

public class ClientCode {
    public static void main(String[] args) {
        addToppingsToPizza(new MilanPizzaFactory());
        addToppingsToPizza(new RomePizzaFactory());
    }

    private static void addToppingsToPizza(AbstractPizzaFactory factory) {
        List<Topping> toppings = asList(factory.makeAnchovy(), factory.makePepperoni(), factory.makeSausage());
        toppings.forEach(topping -> System.out.println("Adding " + topping.getName()));
    }
}

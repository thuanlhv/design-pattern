package factory.pizzafactory;

public class RomePizzaFactory implements AbstractPizzaFactory {
    @Override
    public Pepperoni makePepperoni() {
        return new Pepperoni("Rome");
    }

    @Override
    public Sausage makeSausage() {
        return new Sausage("Rome");
    }

    @Override
    public Anchovy makeAnchovy() {
        return new Anchovy("Rome");
    }
}

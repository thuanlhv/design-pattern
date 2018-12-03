package factory.pizzafactory;

public class MilanPizzaFactory implements AbstractPizzaFactory {
    @Override
    public Pepperoni makePepperoni() {
        return new Pepperoni("Milan");
    }

    @Override
    public Sausage makeSausage() {
        return new Sausage("Milan");
    }

    @Override
    public Anchovy makeAnchovy() {
        return new Anchovy("Milan");
    }
}

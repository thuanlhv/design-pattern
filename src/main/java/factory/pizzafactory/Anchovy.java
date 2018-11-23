package factory.pizzafactory;

public class Anchovy extends Topping {

    public Anchovy(String area) {
        super(area + "pepperoni");
        System.out.println("Making " + area + " anchovy topping");
    }
}

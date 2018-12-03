package factory.pizzafactory;

public class Pepperoni extends Topping {

    public Pepperoni(String area) {
        super(area + "pepperoni");
        System.out.println("Making " + area + " pepperoni topping");
    }
}

package factory.pizzafactory;

public class Sausage extends Topping{

    public Sausage(String area) {
        super(area + "pepperoni");
        System.out.println("Making " + area + " sausage topping");
    }
}

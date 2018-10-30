package builder;

public class ClientCode {
    public static void main(String[] args) {
        Cashier cashier = new Cashier(new Crew());
        cashier.constructMeal();
    }
}

package factory;


public class ClientCode {
    public static void main(String[] args) {
        createCar(new Model1Factory());
        createCar(new Model2Factory());
    }

    private static void createCar(AbstractModelFactory factory) {
        factory.createLeftDoor();
        factory.createRightDoor();
        factory.createHood();
    }
}

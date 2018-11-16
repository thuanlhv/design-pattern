package strategy;

public class ClientCode {

    public static void main(String[] args) {
        TransportationToAirport transportation = new TransportationToAirport();
        transportation.setStrategy(new Taxi());
        transportation.execute();
    }
}

package strategy;

public class TransportationToAirport {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void execute() {
        strategy.execute();
    }
}

package strategy;

public class Taxi implements Strategy {

    @Override
    public void execute() {
        System.out.println("go to airport via taxi");
    }
}

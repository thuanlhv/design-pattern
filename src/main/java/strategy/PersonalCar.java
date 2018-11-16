package strategy;

public class PersonalCar implements Strategy {

    @Override
    public void execute() {
        System.out.println("go to airport via personal car");
    }
}

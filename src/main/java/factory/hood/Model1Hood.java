package factory.hood;

public class Model1Hood implements StampingHood {

    @Override
    public StampingHood stampHood() {
        System.out.println("stamping model 1 hood");
        return this;
    }
}

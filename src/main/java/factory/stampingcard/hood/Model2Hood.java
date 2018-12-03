package factory.stampingcard.hood;

public class Model2Hood implements StampingHood {

    @Override
    public StampingHood stampHood() {
        System.out.println("stamping model 2 hood");
        return this;
    }
}

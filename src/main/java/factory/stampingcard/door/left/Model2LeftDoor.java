package factory.stampingcard.door.left;

public class Model2LeftDoor implements StampingLeftDoor {

    @Override
    public StampingLeftDoor stampLeftDoor() {
        System.out.println("stamping model 2 left door");
        return this;
    }
}

package factory.stampingcard.door.left;

public class Model1LeftDoor implements StampingLeftDoor {

    @Override
    public StampingLeftDoor stampLeftDoor() {
        System.out.println("stamping model 1 left door");
        return this;
    }
}

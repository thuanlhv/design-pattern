package factory.stampingcard.door.right;

public class Model2RightDoor implements StampingRightDoor {

    @Override
    public StampingRightDoor stampRightDoor() {
        System.out.println("stamping model 2 right door");
        return this;
    }
}

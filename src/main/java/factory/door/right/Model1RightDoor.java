package factory.door.right;

public class Model1RightDoor implements StampingRightDoor {

    @Override
    public StampingRightDoor stampRightDoor() {
        System.out.println("stamping model 1 right door");
        return this;
    }
}

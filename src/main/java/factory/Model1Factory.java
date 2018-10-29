package factory;

import factory.door.left.Model1LeftDoor;
import factory.door.left.StampingLeftDoor;
import factory.door.right.Model1RightDoor;
import factory.door.right.StampingRightDoor;
import factory.hood.Model1Hood;
import factory.hood.StampingHood;

public class Model1Factory implements AbstractModelFactory {
    @Override
    public StampingLeftDoor createLeftDoor() {
        return new Model1LeftDoor().stampLeftDoor();
    }

    @Override
    public StampingRightDoor createRightDoor() {
        return new Model1RightDoor().stampRightDoor();
    }

    @Override
    public StampingHood createHood() {
        return new Model1Hood().stampHood();
    }
}

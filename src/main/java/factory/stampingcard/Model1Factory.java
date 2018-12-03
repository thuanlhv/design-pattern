package factory.stampingcard;

import factory.stampingcard.door.left.Model1LeftDoor;
import factory.stampingcard.door.left.StampingLeftDoor;
import factory.stampingcard.door.right.Model1RightDoor;
import factory.stampingcard.door.right.StampingRightDoor;
import factory.stampingcard.hood.Model1Hood;
import factory.stampingcard.hood.StampingHood;

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

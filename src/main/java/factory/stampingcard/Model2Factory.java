package factory.stampingcard;

import factory.stampingcard.door.left.Model2LeftDoor;
import factory.stampingcard.door.left.StampingLeftDoor;
import factory.stampingcard.door.right.Model2RightDoor;
import factory.stampingcard.door.right.StampingRightDoor;
import factory.stampingcard.hood.Model2Hood;
import factory.stampingcard.hood.StampingHood;

public class Model2Factory implements AbstractModelFactory {
    @Override
    public StampingLeftDoor createLeftDoor() {
        return new Model2LeftDoor().stampLeftDoor();
    }

    @Override
    public StampingRightDoor createRightDoor() {
        return new Model2RightDoor().stampRightDoor();
    }

    @Override
    public StampingHood createHood() {
        return new Model2Hood().stampHood();
    }
}

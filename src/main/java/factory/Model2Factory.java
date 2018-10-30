package factory;

import factory.door.left.Model2LeftDoor;
import factory.door.left.StampingLeftDoor;
import factory.door.right.Model2RightDoor;
import factory.door.right.StampingRightDoor;
import factory.hood.Model2Hood;
import factory.hood.StampingHood;

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

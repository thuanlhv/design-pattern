package factory;

import factory.door.left.StampingLeftDoor;
import factory.door.right.StampingRightDoor;
import factory.hood.StampingHood;

public interface AbstractModelFactory {
    StampingLeftDoor createLeftDoor();
    StampingRightDoor createRightDoor();
    StampingHood createHood();
}

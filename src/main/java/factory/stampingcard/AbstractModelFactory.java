package factory.stampingcard;

import factory.stampingcard.door.left.StampingLeftDoor;
import factory.stampingcard.door.right.StampingRightDoor;
import factory.stampingcard.hood.StampingHood;

public interface AbstractModelFactory {
    StampingLeftDoor createLeftDoor();
    StampingRightDoor createRightDoor();
    StampingHood createHood();
}

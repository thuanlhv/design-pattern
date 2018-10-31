package composite;

import java.util.List;

public class Box implements Item {

    List<Item> items;

    public Box(List<Item> items) {
        this.items = items;
    }

    @Override
    public int getPrice() {
        return items.stream().map(Item::getPrice).reduce((int1, int2) -> int1 + int2).get();
    }
}

package state;

public class Off implements State {

    @Override
    public void pull(CeilingFanPull instance) {
        instance.changeState(new LowSpeed());
        System.out.println("turn on, low speed");
    }
}

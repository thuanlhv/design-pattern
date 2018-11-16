package state;

public class LowSpeed implements State {

    @Override
    public void pull(CeilingFanPull instance) {
        instance.changeState(new HighSpeed());
        System.out.println("on high speed mode");
    }
}

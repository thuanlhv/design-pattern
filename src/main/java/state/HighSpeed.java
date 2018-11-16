package state;

public class HighSpeed implements State{

    @Override
    public void pull(CeilingFanPull instance) {
        instance.changeState(new Off());
        System.out.println("turn off");
    }
}

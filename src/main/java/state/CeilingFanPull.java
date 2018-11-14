package state;

public class CeilingFanPull {
    private State currentState;

    public CeilingFanPull(State initialState) {
        this.currentState = initialState;
    }

    public void pull() {
        currentState.pull(this);
    }

    public void changeState(State state) {
        this.currentState = state;
    }
}

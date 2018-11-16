package state;

public class ClientCode {
    public static void main(String[] args) {
        CeilingFanPull fan = new CeilingFanPull(new Off());
        fan.pull();
        fan.pull();
        fan.pull();
    }
}

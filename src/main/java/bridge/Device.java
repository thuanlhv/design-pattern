package bridge;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    void getVolume();
    void setVolume(String percent);
    void getChannel();
    void setChannel(String channel);
}

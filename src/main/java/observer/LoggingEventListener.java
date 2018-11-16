package observer;

public class LoggingEventListener implements EventListener {

    @Override
    public void update() {
        System.out.println("Logging event listener");
    }
}

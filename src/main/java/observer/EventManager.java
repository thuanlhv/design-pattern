package observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    List<EventListener> listeners;

    public EventManager() {
        this.listeners = new ArrayList<>();
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void sendNotification() {
        listeners.forEach(EventListener::update);
    }
}

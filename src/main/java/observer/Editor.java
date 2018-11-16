package observer;

public class Editor {
    private EventManager eventManager;

    public Editor() {
        eventManager = new EventManager();
    }

    public void openFile() {
        eventManager.sendNotification();
    }

    public EventManager getEventManager() {
        return eventManager;
    }
}

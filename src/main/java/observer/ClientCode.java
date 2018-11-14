package observer;

public class ClientCode {

    public static void main(String[] args) {
        Editor editor = new Editor();
        LoggingEventListener loggingEventListener = new LoggingEventListener();
        editor.getEventManager().subscribe(loggingEventListener);
        editor.openFile();
    }
}

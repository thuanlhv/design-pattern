package chainofresponsibility;

public interface Handler {
    void add(Handler handler);
    void execute(int num);
}

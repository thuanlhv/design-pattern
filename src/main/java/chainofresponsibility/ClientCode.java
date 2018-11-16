package chainofresponsibility;

public class ClientCode {
    public static void main(String[] args) {
        BaseHandler handler = new BaseHandler();
        handler.add(new BaseHandler());
        handler.add(new BaseHandler());
        handler.add(new BaseHandler());

        for (int i = 0; i < 6; i++) {
            System.out.println("Operation # " + i);
            handler.execute(i);
            System.out.println();
        }
    }
}

package chainofresponsibility;

import java.util.Random;

public class BaseHandler implements Handler {

    private final static Random RANDOM = new Random();
    private static int nextId = 1;
    private int id = nextId++;
    private Handler nextInChain;

    public void add(Handler next) {
        if(nextInChain == null) {
            nextInChain = next;
        } else {
            nextInChain.add(next);
        }
    }

    @Override
    public void execute(int num) {
        if (RANDOM.nextInt(4) !=0) {
            System.out.println("id " + id + " is busy");
            nextInChain.execute(num);
        } else {
            System.out.println("id " + id + " handled " + num);
        }
    }
}

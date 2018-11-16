package composite;

import java.util.Arrays;

public class ClientCode {
    public static void main(String[] args) {
        Product pen1 = new Product();
        Product pen2 = new Product();
        Product pen3 = new Product();
        Box box3 = new Box(Arrays.asList(pen2, pen3));
        Box box2 = new Box(Arrays.asList(pen2, box3));

        int total = pen1.getPrice() + box2.getPrice();
        System.out.println(total);
    }
}

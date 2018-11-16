package adapter;

public class ClientCode {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        SquarePeg squarePeg = new SquarePeg(5);
        hole.fit(new SquarePegAdapter(squarePeg));
    }
}

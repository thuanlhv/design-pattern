package prototype;

public class ClientCode {
    public static void main(String[] args) {
        SingleCellOrganism cell = new SingleCellOrganism("first cell");
        cell.split();
        cell.getCells().forEach(cell1 -> System.out.println(cell.getName()));
    }
}

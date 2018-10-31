package prototype;

import java.util.ArrayList;
import java.util.List;

public class SingleCellOrganism implements Cell {
    private String name;
    private List<Cell> cells = new ArrayList<>();

    public SingleCellOrganism(String name) {
        this.name = name;
        cells.add(this);
    }

    public String getName() {
        return name;
    }

    public List<Cell> getCells() {
        return cells;
    }

    @Override
    public void split() {
        cells.add(clone(this));
    }

    private SingleCellOrganism clone(SingleCellOrganism cell) {
        return new SingleCellOrganism(cell.name);
    }
}

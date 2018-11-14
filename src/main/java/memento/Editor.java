package memento;

public class Editor {
    private String text;
    private String curX;
    private String cury;
    private String selectionWidth;

    public void setText(String text) {
        this.text = text;
    }

    public void setCurX(String curX) {
        this.curX = curX;
    }

    public void setCury(String cury) {
        this.cury = cury;
    }

    public void setSelectionWidth(String selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public Snapshot saveSnapshot() {
        return new Snapshot(this, text, curX, cury, selectionWidth);
    }

    public String getText() {
        return text;
    }
}

package memento;

public class Snapshot {
    private Editor editor;

    private String text;
    private String curX;
    private String curY;
    private String selectionWidth;

    public Snapshot(Editor editor, String text, String curX, String curY, String selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    public void restore() {
        editor.setText(text);
        editor.setCurX(curX);
        editor.setCury(curY);
        editor.setSelectionWidth(selectionWidth);
    }
}

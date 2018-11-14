package memento;

public class Command {
    private Snapshot backup;
    private Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void makeBackup() {
        backup = editor.saveSnapshot();
    }

    public void undo() {
        if (backup != null) {
            backup.restore();
        }
    }
}

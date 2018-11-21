package memento;

public class ClientCode {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setText("text");
        editor.setCurX("X");
        editor.setCury("Y");
        editor.setSelectionWidth("test");

        Command command = new Command(editor);
        command.makeBackup();
        editor.setText("text123");
        System.out.println("Before: " + editor.getText());
        command.undo();
        System.out.println("After: " + editor.getText());
		System.out.println("This is test");
    }
}

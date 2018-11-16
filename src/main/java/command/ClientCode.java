package command;

public class ClientCode {

    public static void main(String[] args) {
        Remote remote = new Remote();
        Light light = new Light();
        remote.setCommand(new LightOnCommand(light));
        remote.executeCommand();
        remote.setCommand(new LightOffCommand(light));
        remote.executeCommand();

        TV tv = new TV();
        remote.setCommand(new TVOnCommand(tv));
        remote.executeCommand();
        remote.setCommand(new TVOffCommand(tv));
        remote.executeCommand();
    }
}

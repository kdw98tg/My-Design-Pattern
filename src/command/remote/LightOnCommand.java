package src.command.remote;

public class LightOnCommand implements Command {

    private Light light = null;

    public LightOnCommand(Light _light) {
        this.light = _light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

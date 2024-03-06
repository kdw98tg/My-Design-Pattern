package src.command.remote_undo;

public class LightOnCommand implements Command{

    private Light light = null;
    private int level = 0;

    public LightOnCommand(Light _light){
        this.light = _light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}

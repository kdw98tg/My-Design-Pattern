package src.command.remote_undo;

public interface Command {
    public void execute();
    public void undo();
}

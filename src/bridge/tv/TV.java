package src.bridge.tv;

public abstract class TV {
    public abstract void on();
    public abstract void off();
    public abstract void tuneChannel(int _channel);
    public abstract int getChannel();
}

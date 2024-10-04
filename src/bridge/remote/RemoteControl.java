package src.bridge.remote;

import src.bridge.TVFactory;
import src.bridge.tv.TV;
import src.bridge.tv.TVType;

public abstract class RemoteControl {
    private TV tv = null;
    private TVFactory tvFactory = null;

    public RemoteControl(TVFactory _tvFactory) {
        this.tvFactory = _tvFactory;
    }

    public void on() {
        this.tv.on();
    }

    public void off() {
        this.tv.off();
    }

    public void setChannel(int _channel) {
        tv.tuneChannel(_channel);
    }

    public int getChannel() {
        return tv.getChannel();
    }

    public void setTV(TVType _type) {
        try {
            tv = tvFactory.getTV(_type);
        } catch (Exception _ex) {
            System.out.println(_ex);
        }
    }

}

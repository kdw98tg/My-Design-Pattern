package src.bridge.remote;

import src.bridge.TVFactory;

public class GenericRemote extends RemoteControl {

    public GenericRemote(TVFactory _tvFactory) {
        super(_tvFactory);
    }

    public void nextChannel() {
        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void prevChannel() {
        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }
}

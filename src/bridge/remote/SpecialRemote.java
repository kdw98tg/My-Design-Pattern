package src.bridge.remote;

import src.bridge.TVFactory;

public class SpecialRemote extends RemoteControl{
    public SpecialRemote(TVFactory _tvFactory) {
        super(_tvFactory);
    }

    public void up() {
        int channel = this.getChannel();
        this.setChannel(channel+1);
    }
    public void down() {
        int channel = this.getChannel();
        this.setChannel(channel-1);
    }
}

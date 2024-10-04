package src.bridge.tv;

public class LG extends TV{

    private int channel = 1;

    @Override
    public void on() {
        System.out.println("TV 키는 중");
    }

    @Override
    public void off() {
        System.out.println("TV 끄는 중");
    }

    @Override
    public void tuneChannel(int _channel) {
        this.channel = _channel;
        System.out.println("TV 채널을 "+_channel + " 로 변경합니다.");
    }

    @Override
    public int getChannel() {
        return channel;
    }
}

package src.bridge.tv;

public class Sony extends TV {
    private int station = 1;

    @Override
    public void on() {
        System.out.println("Sony TV 켜는 중");
    }

    @Override
    public void off() {
        System.out.println("Sony TV 끄는 중");
    }

    @Override
    public void tuneChannel(int _channel) {
        this.station = _channel;
        System.out.println("TV 채널을 "+_channel + " 로 변경합니다.");
    }

    @Override
    public int getChannel() {
        return station;
    }
}

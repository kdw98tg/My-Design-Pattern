package src.command.remote_undo;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " 바람 세기 강");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " 바람 세기 중");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " 바람 세기 하");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " 팬 꺼짐");
    }

    public int getSpeed() {
        return speed;
    }
}
package src.command.remote_undo;

public class Light {
    private String location = "";
    private int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "불 켜짐");
    }

    public void off() {
        System.out.println(location + "불 꺼짐");
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            System.out.println("불빛 강도는 " + level + "%");
        }
    }

    public int getLevel() {
        return level;
    }
}

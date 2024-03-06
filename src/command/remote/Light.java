package src.command.remote;

public class Light {
    private String location ="";

    public Light(String _location) {
        this.location = _location;
    }
    public Light(){}

    public void on(){
        System.out.println(location + "light is on");
    }
    public void off(){
        System.out.println(location+"light is off");
    }
}

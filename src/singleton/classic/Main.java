package src.singleton.classic;

public class Main {
    public static void main(String[] args) {
        ClassicSingleton singleton = ClassicSingleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}

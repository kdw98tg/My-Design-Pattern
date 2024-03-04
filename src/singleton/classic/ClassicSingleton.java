package src.singleton.classic;

public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton(){}

    public static ClassicSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "싱글톤 객체 입니다.";
    }
}

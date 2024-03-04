package src.singleton.static_singleton;

public class StaticSingleton {

    //인스턴스가 필요할 때는 생성하지말고 처음부터 만드는게 좋음
    //synchroized 를 안쓰고 구현하려면 이렇게 하면 됨
    private static StaticSingleton Instance = new StaticSingleton();

    private StaticSingleton(){}

    public static StaticSingleton getInstance(){return Instance;}

}

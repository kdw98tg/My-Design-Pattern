package src.singleton.double_checked_locking;

public class DCLSingleton {

    //volatile 키워드를 사용하면 멀티스레딩을 쓰더라도,
    // uniqueInstance 변수가 Singleton 인스턴스로 초기화되는 과정이 올바르게 진행됨
    //이런식으로 구현하면, getInstance()메소드를 사용할 때 발생하는 속도를 극적으로 줄일 수 있음
    //dcl 은 자바 1.4 버전 이전에는 사용할 수 없음
    private volatile static DCLSingleton uniqueInstance;

    private DCLSingleton (){}

    public static DCLSingleton getInstance(){
        if(uniqueInstance == null){
            //인스턴스가 있는지 확인하고, 없으면 동기화된 블록으로 들어감
            //이렇게하면 처음에만 동기화 됨
            synchronized (DCLSingleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new DCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}

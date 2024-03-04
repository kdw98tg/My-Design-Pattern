package src.singleton.thread_safe;

import java.util.TreeMap;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton (){};
    private static ThreadSafeSingleton Instance;
    
    //synchronized 키워드를 넣어서 멀티스레드 문제를 해결
    //synchronized 키워드를 넣으면 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다림
    //하지만 동기화에서의 속도저하가 일어날 수 있음
    //성능이 100배정도 저하될 수 있지만, 속도가 문제가 아니라면 걍 사용하면 됨
    public static synchronized ThreadSafeSingleton getInstance(){
        if(Instance == null){
            Instance = new ThreadSafeSingleton();
        }
        return Instance;
    }
}

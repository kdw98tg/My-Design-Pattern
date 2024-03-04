package src.singleton.chocolate;

import src.factory.Pizzas;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler Instance = null;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(Instance == null){
            Instance = new ChocolateBoiler();
        }
        return Instance;
    }

    //다 찼을때 실행할 메소드
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    //끓인 재료를 다음 단계로 넘기기 위한 메소드
    public void drain(){
        if(!isEmpty()&&isBoiled()){
            //끓인 재료를 다음 단계로 넘김
            empty = true;
        }
    }

    //재료를 끌히는 메소드
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            //재료를 끓임
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}

package src.state.context;

import src.state.State;

public class GumballMachine {
    private State soldState;
    private State soldOutState;
    private State noQuaterState;
    private State hasQuaterState;
    private State winnerState;

    private State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {

    }

    public void insertQuater(){
        state.insertQuater();
    }

    //꺼내다
    public void ejectQuater(){
        state.ejectQuater();
    }

    //돌리다
    public void turnCrank(){
        state.turnCrank();
        state.dispense();//분배하다
    }

    //나오다
    public void releaseBall() {
        System.out.println("슬롯에서 알맹이가 나오는 중입니다.");
        if (count != 0) {
            count = count - 1;
        }
    }

    public int getCount(){
        return count;
    }
    public State getState(){
        return state;
    }
    public void setState(State state){
        this.state = state;
    }
    public State getSoldState(){
        return soldState;
    }
    public State getSoldOutState(){
        return soldOutState;
    }
    public State getNoQuaterState(){
        return noQuaterState;
    }
    public State getHasQuaterState(){
        return hasQuaterState;
    }
    public State getWinnerState(){
        return winnerState;
    }
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("\n주식회사 왕뽑기");
        result.append("\n자바로 돌아가는 2004년형 뽑기 기계");
        result.append("\n남은 갯수: "+ count + " 개");
        result.append("\n");
        result.append("\n현재 상태는 "+ state +"\n");
        return result.toString();
    }
}

package src.state.gumballstate;

public class GumballMachine {
    private State soldState;
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;

    private State state;

    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuaterState(this);
        hasQuarterState = new HasQuaterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
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

    public void refill(int _count){
        this.count += _count;
        System.out.println("껌볼이 리필됨. 현재 검볼 : "+ _count);
        state.refill();
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
    public State getNoQuarterState(){
        return noQuarterState;
    }
    public State getHasQuarterState(){
        return hasQuarterState;
    }
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("\n주식회사 왕뽑기");
        result.append("\n2024년형 뽑기 기계");
        result.append("\n남은 갯수: "+ count + " 개");
        result.append("\n");
        result.append("\n현재 상태는 "+ state +"\n");
        return result.toString();
    }
}

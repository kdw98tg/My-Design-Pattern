package src.state.gumballstate;

public class HasQuaterState implements State {

    private GumballMachine gumballMachine = null;

    public HasQuaterState(GumballMachine _gumballMachine) {
        this.gumballMachine = _gumballMachine;
    }

    //동전 넣기
    @Override
    public void insertQuater() {
        System.out.println("동전을 또 넣을 수 없습니다");
    }

    //동전 반환하기
    @Override
    public void ejectQuater() {
        System.out.println("동전이 반환되었습니다");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    //손잡이 돌리기
    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌렸습니다...");
        gumballMachine.setState(gumballMachine.getSoldOutState());
    }

    //껌볼 내보내기
    @Override
    public void dispense() {
        System.out.println("껌볼이 나오지 않았습니다");
    }

    public void refill(){

    }
    public String toString(){
       return "손잡이를 돌리기 기다리는 중";

    }

}

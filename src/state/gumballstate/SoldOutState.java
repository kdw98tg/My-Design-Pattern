package src.state.gumballstate;

public class SoldOutState implements State{

    private GumballMachine gumballMachine = null;
    public SoldOutState(GumballMachine _gumballMachine){
        this.gumballMachine = _gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("껌볼이 다 떨어져서 동전을 넣을 수 없습니다");
    }

    @Override
    public void ejectQuater() {
        System.out.println("동전을 넣지 않았기 때문에 반환할 수 없습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌렸지만, 껌볼이 없습니다");
    }

    @Override
    public void dispense() {
        System.out.println("껌볼이 나오지 않았습니다");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString(){
        return "껌볼이 다 떨어졌습니다.";
    }


}

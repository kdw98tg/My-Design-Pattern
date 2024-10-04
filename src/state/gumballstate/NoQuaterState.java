package src.state.gumballstate;

public class NoQuaterState implements State{

    private GumballMachine gumballMachine = null;

    public NoQuaterState (GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuater() {
        System.out.println("동전을 넣지 않았습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌렸지만, 동전이 없습니다");
    }

    @Override
    public void dispense() {
        System.out.println("먼저 돈을 넣어야 합니다");
    }

    public void refill(){

    }

    public String toString(){
        return "동전을 기다리는 중";
    }

}

package src.state.gumballstate;

public class SoldState implements State{

    private GumballMachine gumballMachine = null;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("이미 알맹이를 뽑았습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한번만 돌려주세요.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else{
            System.out.println("이런, 껌볼이 다 떨어졌습니다!");
        }
    }

    @Override
    public void refill() {

    }

    public String toString(){
        return "껌볼을 내보내는 중";
    }
}

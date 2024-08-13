package src.state;

import src.state.context.GumballMachine;

public class NoQuaterState implements State{

    private GumballMachine gumballMachine = null;

    public NoQuaterState (GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuaterState());
    }

    @Override
    public void ejectQuater() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}

package src.state.gumballstate;

public interface State {
    void insertQuater();
    void ejectQuater();
    void turnCrank();
    void dispense();
    public void refill();
}

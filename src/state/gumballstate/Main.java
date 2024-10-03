package src.state.gumballstate;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuater();
        gumballMachine.turnCrank();
        gumballMachine.insertQuater();
        gumballMachine.turnCrank();

        gumballMachine.refill(5);
        gumballMachine.insertQuater();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

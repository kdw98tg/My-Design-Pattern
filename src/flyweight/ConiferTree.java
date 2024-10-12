package src.flyweight;

public class ConiferTree implements Tree {
    @Override
    public void display(int _x, int _y) {
        System.out.println("침엽수 나무가 위치한 좌표" + _x + ", " + _y);
    }
}

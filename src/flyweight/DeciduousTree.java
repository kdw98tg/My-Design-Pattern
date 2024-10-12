package src.flyweight;

import java.time.LocalDate;

public class DeciduousTree implements Tree {
    @Override
    public void display(int _x, int _y) {

        System.out.println("활엽수 나무가 위치한 좌표: " + _x + ", " + _y);

        if (!this.isWithinRange(LocalDate.now())) {
            System.out.println("현재 나무에는 잎이 없습니다.");
        }
    }
}

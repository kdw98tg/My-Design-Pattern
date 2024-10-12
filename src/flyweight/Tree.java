package src.flyweight;

import java.time.LocalDate;
import java.time.Month;

public interface Tree {
    public void display(int _x, int _y);

    public default boolean isWithinRange(LocalDate _date) {
        Month month =_date.getMonth();
        return (month.getValue() > 2) && (month.getValue() < 11);
    }

}

package src.builder.elements;

import java.time.LocalDate;

public class Reservation {
    private LocalDate arrivalDate;
    private int nights;

    public void setArrivalDate(int _year, int _month, int _day) {
        this.arrivalDate = LocalDate.of(_year, _month, _day);
    }
    public LocalDate getArrivalDate() {
        return this.arrivalDate;
    }
    public void setNights(int _nights) {
        this.nights = _nights;
    }
    public int getNights() {
        return this.nights;
    }
}

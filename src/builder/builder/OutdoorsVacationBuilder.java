package src.builder.builder;

import src.builder.elements.Reservation;
import src.builder.elements.Tent;

public class OutdoorsVacationBuilder extends VacationBuilder{
    public OutdoorsVacationBuilder() {
        this.name = "야외 휴가 빌더";
    }
    public VacationBuilder addAccommodation() {
        this.accommodations.add(new Tent());
        return this;
    }
    public VacationBuilder addAccommodation(String _name) {
        this.accommodations.add(new Tent(_name));
        return this;
    }
    public VacationBuilder addAccommodation(String _name, int _year, int _month, int _day, int _nights, int _location) {
        Reservation reservation = new Reservation();
        reservation.setArrivalDate(_year, _month, _day);
        reservation.setNights(_nights);

        Tent tent = new Tent(name);
        tent.setReservation(reservation);
        tent.setSiteNumber(_location);
        this.accommodations.add(tent);
        return this;
    }
    public VacationBuilder addEvent(String event) {
        this.events.add("Hike: " + event);
        return this;
    }
}

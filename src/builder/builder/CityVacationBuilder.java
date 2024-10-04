package src.builder.builder;

import src.builder.elements.Hotel;
import src.builder.elements.Reservation;

public class CityVacationBuilder extends VacationBuilder{

    public CityVacationBuilder(){
        this.name = "씨티 투어 빌더";
    }
    @Override
    public VacationBuilder addAccommodation() {
        this.accommodations.add(new Hotel());
        return this;
    }

    @Override
    public VacationBuilder addAccommodation(String _name) {
        this.accommodations.add(new Hotel(name));
        return this;
    }

    @Override
    public VacationBuilder addAccommodation(String _name, int _year, int _month, int _day, int _nights, int _location) {
        Reservation reservation = new Reservation();
        reservation.setArrivalDate(_year, _month, _day);
        reservation.setNights(_nights);

        Hotel hotel = new Hotel(name);
        hotel.setReservation(reservation);
        hotel.setRoomNumber(_location);
        this.accommodations.add(hotel);
        return this;
    }

    @Override
    public VacationBuilder addEvent(String _event) {
        this.events.add(_event + " 공연을 관람합니다.");
        return this;
    }
}

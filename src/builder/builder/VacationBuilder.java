package src.builder.builder;

import src.builder.elements.Accommodation;
import src.builder.elements.Vacation;

import java.util.ArrayList;
import java.util.List;

public abstract class VacationBuilder {
    protected String name = null;
    protected List<Accommodation> accommodations = new ArrayList<Accommodation>();
    protected List<String> events = new ArrayList<String>();

    public abstract VacationBuilder addAccommodation();
    public abstract VacationBuilder addAccommodation(String _name);
    public abstract VacationBuilder addAccommodation(String _name, int _year, int _month, int _day, int _nights, int _location);
    public abstract VacationBuilder addEvent(String _event);

    public Vacation getVacation(){
        Vacation vacation = new Vacation();
        vacation.setName(name);
        vacation.setAccommodations(accommodations);
        vacation.setEvents(events);
        return vacation;
    }

}

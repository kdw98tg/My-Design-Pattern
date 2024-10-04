package src.builder.elements;

import java.util.ArrayList;
import java.util.List;

public class Vacation {
    private String name = null;
    private List<Accommodation> accommodations = new ArrayList<>();
    private List<String> events = new ArrayList<String>();

    public void setName(String _name) {
        this.name = _name;
    }
    public void setAccommodations(List<Accommodation> _accommodations) {
        this.accommodations = _accommodations;
    }
    public void setEvents(List<String> _events) {
        this.events = _events;
    }
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + this.name + " ----\n");
        for (Accommodation a : accommodations) {
            display.append(a);
        }
        for (String e : events) {
            display.append(e + "\n");
        }
        return display.toString();
    }
}

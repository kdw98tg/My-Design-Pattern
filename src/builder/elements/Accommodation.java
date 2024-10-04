package src.builder.elements;


//숙소
public abstract class Accommodation {

    protected String name = null;
    private Reservation reservation = null;

    public void setReservation(Reservation _reservation) {
        this.reservation = _reservation;
    }
    public Reservation getReservation() {
        return this.reservation;
    }
    public abstract String getLocation();
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("당신은 " + name + "에 머물고 있습니다.");
        if (this.reservation != null) {
            display.append("\n도착일: " + reservation.getArrivalDate() +
                    ", " + reservation.getNights() + "박 동안 예약이 되어 있습니다.");
        }
        if (this.getLocation() != "") {
            display.append(" 위치는 " + this.getLocation() + "입니다.");
        }
        display.append("\n");
        return display.toString();
    }

}

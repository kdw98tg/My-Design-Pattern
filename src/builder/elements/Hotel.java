package src.builder.elements;

public class Hotel extends Accommodation {
    int roomNumber;
    public Hotel() {
        this.name = "호텔";
    }
    public Hotel(String name) {
        this.name = name;
    }
    public void setRoomNumber(int n) {
        this.roomNumber = n;
    }
    public int getRoomNumber() {
        return this.roomNumber;
    }
    public String getLocation() {
        if (roomNumber == 0) return "";
        else return "방번호:  " + this.roomNumber;
    }
}

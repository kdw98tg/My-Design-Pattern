package src.builder.elements;

public class Tent extends Accommodation {
    int siteNumber;
    public Tent() {
        this.name = "텐트";
    }
    public Tent(String _name) {
        this.name = _name;
    }
    public void setSiteNumber(int _n) {
        this.siteNumber = _n;
    }
    public int getSiteNumber() {
        return this.siteNumber;
    }
    public String getLocation() {
        if (siteNumber == 0) return "";
        else return "사이트 번호 " + this.siteNumber;
    }
}

package src.command.remote;

public class CeilingFan {
	String location = "";
	int level;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;
 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
		// turns the ceiling fan on to high
		level = HIGH;
		System.out.println(location + " 팬 high");
 
	} 

	public void medium() {
		// turns the ceiling fan on to medium
		level = MEDIUM;
		System.out.println(location + " 팬 medium");
	}

	public void low() {
		// turns the ceiling fan on to low
		level = LOW;
		System.out.println(location + " 팬 low");
	}
 
	public void off() {
		// turns the ceiling fan off
		level = 0;
		System.out.println(location + " 팬 꺼짐");
	}
 
	public int getSpeed() {
		return level;
	}
}

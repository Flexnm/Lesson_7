package singletonDesignPattern;

public class Superman {
	
	// singleton: having one object and multiple references.
	
	// Three steps to make a Class a Singleton:
	// 1) Create a Class instance of Superman:
	private static Superman instance = new Superman();

	private int speed;
	private int altitude;

	// 2) Create a private CTOR:
	private Superman() {

	}
	
	// 3) Create a public static method to get the instance:
	public static Superman getInstance() {
		return instance;
	}
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	@Override
	public String toString() {
		return "Superman [speed = " + speed + ", altitude = " + altitude + "]";
	}

}

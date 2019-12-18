package staticAndDynamic;

public class Car {

	
	// STATIC FIELDS:
	// Static field - class variables.
	private static int counter;
	private static int colorCounter;
	
	// Constant - Combination of final and static:
	public static final int MAX_SPEED = 180;
	
	

	// NON-STATIC FIELDS:
	// Attributes - instance variables.
	private final int number; // final attribute - initialized and not changed
	private int speed; // instance variable - can be changed.
	private String color;

	// Initializer - runs before CTORs
	{
		counter++;
		System.out.println("Instance created");
	}
	
	// Static initializer - runs on class load (Runs a single time).
	static {
		System.out.println("Class loaded");
	}

	// CTOR
	public Car(int number, int speed, String color) {
		this.number = number;
		setSpeed(speed);
		this.color = color;
		colorCounter++;
	}

	public Car(int number, int speed) {
		this.number = number;
		setSpeed(speed);
	}

	public Car(int number) {
		this.number = number;
	}


	public Car() {
		this(-1,0,"");
	}

	// Static method - class method:
	public static int getCounter() {
		return counter;
	}

	public static int getColorCounter() {
		return colorCounter;
	}

	// Instance methods - non-static
	// All non-static methods have "this." in them.

	public int getNumber() {
		return number;
	}

	// public void setNumber(int number) { cannot be set - cannot be changed due to 'final'
	//	this.number = number;
	//}

	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed <= MAX_SPEED) {
		this.speed = speed;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

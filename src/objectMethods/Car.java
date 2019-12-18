package objectMethods;

public class Car {

	private int number;
	private String color;
	private double speed;

	public Car(int number, String color) {
		setColor(color);
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getNumber() {
		return number;
	}

	// Override Object methods

	@Override
	public String toString() {
		String str = "Car[number = " + number + ", color = " + color + ", speed = " + speed + "\t]";
		return str;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		// If we are here, then obj is a car.
		Car other = (Car) obj;

		if (this.number == other.number) { // 'this' is the object that calls the method.
			return true;
		} else {
			return false;
		}

	}

	// main method for demonstration purposes.
	public static void main(String[] args) {
		Car c1 = new Car(101, "Blue");
		Car c2 = new Car(101, "Red");
		Car c3 = new Car(301, "Green");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}

}

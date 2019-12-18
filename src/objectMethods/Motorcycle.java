package objectMethods;

public class Motorcycle { // Another example of overriding object methods.

	private int speed;
	private int number;
	private int cc;

	// We need to override toString, hashCode and equals.

	@Override
	public String toString() {
		return "Motorcycle [speed=" + speed + ", number=" + number + ", cc=" + cc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Motorcycle)) {
			return false;
		}
		Motorcycle other = (Motorcycle) obj;
		if (number != other.number) {
			return false;
		}
		return true;
	}

	

}

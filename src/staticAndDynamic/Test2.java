package staticAndDynamic;

public class Test2 {
	public static void main(String[] args) {
		
		System.out.println(Car.getCounter());
		
		Car c1 = new Car(100, 120, "Blue");
		Car c2 = new Car(101, 80, "Red");
		Car c3 = new Car(102, 60, "Green");
		
		System.out.println(Car.getCounter());
		
		System.out.println("Car max speed: " + Car.MAX_SPEED);
	}

}

package staticAndDynamic;

public class CarTest {
	
	public static void main(String[] args) {
		
		System.out.println(Car.getCounter()); // Prints out the number of times an object of type Car was created.
		System.out.println(Car.getColorCounter());
		
		Car c1 = new Car(101, 300, "Red");
		Car c2 = new Car(245, 120, "Blue");
		Car c3 = new Car(689, 50, "Yellow");
		Car c4 = new Car(753, 0, "Green");
		Car c5 = new Car(578, 80, "Purple");
		Car c6 = new Car(456, 50);
		Car c7 = new Car(112, 50);
		
		System.out.println(Car.getColorCounter());
		System.out.println(Car.getCounter()); // Prints out the number of times an object of type Car was created.
	}

}

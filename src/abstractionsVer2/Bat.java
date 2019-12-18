package abstractionsVer2;

public class Bat extends Mammal implements AdvancedFlyer {

	public void speak() {
		System.out.println("Eeeeeeeeeeee!");
	}

	public void fly() {
		System.out.println("Flies like a Bat!");
	}
	
	public void takeOff() {
		System.out.println("Bat can take off!");
	}
	
	public void land() {
		System.out.println("Bat can land!");
	}
	
	public void navigate() {
		System.out.println("Bat can navigate!");
	}

}

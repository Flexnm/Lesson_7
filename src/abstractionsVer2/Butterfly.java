package abstractionsVer2;

public class Butterfly extends Insect implements Flyer, Navigator {

	public void speak() {
		System.out.println("Stop consuming shit!");
	}

	public void fly() {
		System.out.println("Flies like a Butterfly!");
	}

	public void navigate() {
		System.out.println("Butterfly can navigate!");
	}

}

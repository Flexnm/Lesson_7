package abstractionsVer2;

public class Ant extends Insect implements Navigator {

	public void speak() {
		System.out.println("Wat!");
	}

	public void navigate() {
		System.out.println("Ants can navigate!");
	}

}

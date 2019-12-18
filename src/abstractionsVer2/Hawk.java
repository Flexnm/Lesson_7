package abstractionsVer2;

public class Hawk extends Bird implements Flyer {

	public void speak() {
		System.out.println("Dieeeeeeeeeeeee!");
	}

	public void fly() {
		System.out.println("Flies like a Hawk!");
	}
}

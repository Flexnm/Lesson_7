package abstractionsVer2;

public class Test {
	public static void main(String[] args) {

		Animal[] animals = new Animal[6];

		animals[0] = new Bat();
		animals[1] = new Cat();
		animals[2] = new Ostrich();
		animals[3] = new Hawk();
		animals[4] = new Butterfly();
		animals[5] = new Ant();

		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.speak();
			if (animal instanceof AdvancedFlyer) {
				((AdvancedFlyer) animal).fly();
				((AdvancedFlyer) animal).land();
				((AdvancedFlyer) animal).navigate();
				continue;

			}
			if (animal instanceof Flyer) {
				((Flyer) animal).fly();
			}
			if (animal instanceof Navigator) {
				((Navigator) animal).navigate();
			}

		}

	}

}

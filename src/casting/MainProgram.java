package casting;

public class MainProgram {
	public static void main(String[] args) {

		Person[] persons = new Person[10];

		persons[0] = new Person("Dan");
		persons[1] = new Carpenter("Yosi");
		persons[2] = new Painter("Danna");
		persons[3] = new Carpenter("Yael");
		persons[4] = new Physician("Mark");
		persons[5] = null;
		persons[6] = new Person("John");
		persons[7] = new Painter("David");
		persons[8] = new Person("James");
		persons[9] = new Person("Dan");

		for (int i = 0; i < persons.length; i++) {
			Person curr = persons[i];
			if (curr != null) {
				curr.speak();
			}

		}
		System.out.println("==============================");
		System.out.println("David does not feel well.");
		System.out.println("We need a physician!");

		Physician physician = null; // Creating a reference of type Physician and initializing it to null.

		for (int i = 0; i < persons.length; i++) {
			Person curr = persons[i];
			if (curr instanceof Physician) {
				// Found a physician - assign it to physician reference.
				physician = (Physician) curr; // Requires explicit casting due to down-casting. Physician is more
												// specific than Person. Explicit casting after checking.
				break;
			}
		}
		// Was a physician found?
		if (physician != null) {
			System.out.println("We found Dr. " + physician.name + "!");
			physician.treat(persons[7]);
		} else {
			System.out.println("We did not find a physician.");
		}

	}

}

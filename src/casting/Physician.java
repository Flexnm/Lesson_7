package casting;

public class Physician extends Person {

	public Physician(String name) {
		super(name);
	}

	public void treat(Person person) {
		System.out.println("Dr. " + name + ", who is a physician, is treating " + person.name + ".");
	}

}

package casting;

public class Person {
	
	protected String name;
	
	
	// CTOR
	public Person(String name) {
		this.name = name;
	}
	
	public Person() {
		
	}
	
	public void speak() { // This method is shared with all the classes that extends Person.
		 System.out.println(name + " is speaking.");
	}
	

}

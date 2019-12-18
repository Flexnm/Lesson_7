package singletonDesignPattern;

public class SupermanTest {
	public static void main(String[] args) {
		
	//	Superman s = new Superman(); Causes an error because the CTOR is private.
		
		Superman s = Superman.getInstance();
		
		s.setAltitude(100);
		s.setSpeed(250);
		
		System.out.println(s.toString());
		
		Superman mySuperman = Superman.getInstance();
		
		mySuperman.setAltitude(500);
		System.out.println(mySuperman.toString());
		
	}

}

package singletonDesignPattern;

// static import - allows to not repeat the "Class." when calling for method of that Class.
import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.random;

// import [...] class.names.[...].* <<< '*' is used to generalize imports.

public class StaticImportDemo {
	public static void main(String[] args) {
		
		
	//	System.out.println("Pi = " + Math.PI);
		System.out.println("Pi = " + PI);
	//	System.out.println("e = " + Math.E);
		System.out.println("e = " + E);
		
//		int r = (int)(Math.random()*11);
		int r = (int)(random()*11);
		
		System.out.println("r = " + r);
		
	}

}

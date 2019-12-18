package wrapperClasses;

public class Demo1 { // learning Wrapper classes.
	public static void main(String[] args) {
		
	//	int xPrimitive = 5;
		
		
	//	Integer xWrapperOldStyle = new Integer(5);
		Integer xWrapperNewStyle = 5; // auto inboxing.
		
		
		System.out.println(xWrapperNewStyle);
		
		// methods and fields
		
		// minimum and maximum
		System.out.println(Integer.MIN_VALUE); // for 32 bit number in this case.
		System.out.println(Integer.MAX_VALUE);
		
		
		String numberAsString = "259"; // If within the string there is a non int character we will get an error.
		
		int numberAsInt = Integer.parseInt(numberAsString); // Convert a string of numbers into an int using parseInt.
		System.out.println(numberAsInt); 
	}

}

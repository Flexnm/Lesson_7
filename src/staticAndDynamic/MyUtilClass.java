package staticAndDynamic;

public class MyUtilClass {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int sumAB = MyUtilClass.sum(4, 6); // Static reference - using the Class name as a reference.
		System.out.println(sumAB);
		
		System.out.println(Math.PI);
		
	}

}

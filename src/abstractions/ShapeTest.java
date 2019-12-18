package abstractions;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Shape rec = new Rectangle("Blue", 5, 4);
		
		Shape cir = new Circle("Red", 3);
		
		System.out.println(rec.getColor() + " " + rec.getArea());
		System.out.println(cir.getColor() + " " +cir.getArea());
	}

}

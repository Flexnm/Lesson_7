package abstractions;

public class Circle extends Shape{
	
	private int radius;
	
	
	public Circle(String color, int radius) {
		super(color);
		setRadius(radius);
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadious() {
		return radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}

}

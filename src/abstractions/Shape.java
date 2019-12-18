package abstractions;

public abstract class Shape {
	
	private String color;
	
	public Shape(String color) {
		setColor(color);
	}
	
	public Shape() {
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	// Abstract method:
	public abstract double getArea();

}

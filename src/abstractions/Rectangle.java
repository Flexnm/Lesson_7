package abstractions;

public class Rectangle extends Shape{
	
	private int length;
	private int width;
	
	
	public Rectangle(String color, int length, int width) {
		super(color);
		setLength(length);
		setWidth(width);
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public double getArea() {
		return length * width;
	}

}

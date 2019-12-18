package classExercises;

public class Point {

	/*
	 * a point is defined as a place that is expressed by x and y values. example:
	 * (0,0), (3,5), (2,1), (6,8). Write a program that will recognize identical
	 * points. (0,0), (4,7), (3,5), (4,7), (9,2).
	 * 
	 */

	private int x;
	private int y;

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// @Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}
		Point same = (Point) obj;
		return this.getX() == same.getX() && this.getY() == same.getY(); // This is a boolean expression that will
																			// return true or false.

		/*
		 * if ((this.getX() == same.getX()) && (this.getY() == same.getY())) { return
		 * true; } else { return false; }
		 */

	}
	
	@Override
	public String toString() {
		String str = "(" + x + "," + y + ")";
		return str;
	}
	
	@Override
	public int hashCode() {
		return 100 + x + y * 2 * y;
	}

	public static void main(String[] args) {
		Point[] points = new Point[10];
		points[0] = new Point(3, 5);
		points[1] = new Point(1, 2);
		points[2] = new Point(4, 8);
		points[3] = new Point(6, 7);
		points[4] = new Point(3, 5);
		points[5] = new Point(2, 2);
		points[6] = new Point(4, 8);
		points[7] = new Point(3, 5);
		points[8] = new Point(5, 9);
		points[9] = new Point(2, 2);

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {

				System.out.println(points[i] + " - " + points[j] + ": " + points[i].equals(points[j]) + "\tHash1: " + points[i].hashCode() + "\tHash2: " + points[j].hashCode());

			}
		}
	}

}

package shapes;

public class Rectangle extends Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double calArea() {
		System.out.println("A rectangle has 4 sides.");
		return length * breadth;
	}

}

package shapes;

public class Circle extends Shape {
	private static final double PI = 3.14;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double calArea() {
		System.out.println("A circle has no sides.");
		return PI * radius * radius;

	}

}

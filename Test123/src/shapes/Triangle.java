package shapes;

public class Triangle extends Shape {

	private static final double K = 0.5;
	private double height;
	private double base;

	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	public double calArea() {
		System.out.println("A triangle has 3 sides.");
		return K * height * base;
	}
}

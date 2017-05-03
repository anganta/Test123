package shapes;

public class Square extends Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double calArea() {
		System.out.println("A square has 4 sides.");
		return side * side;
	}

}

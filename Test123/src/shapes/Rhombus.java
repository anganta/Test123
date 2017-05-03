package shapes;

public class Rhombus extends Shape {

	private static final double K = 0.5;
	private double diagnol1;
	private double diagnol2;

	public Rhombus(double diagnol1, double diagnol2) {
		this.diagnol1 = diagnol1;
		this.diagnol2 = diagnol2;
	}

	public double calArea() {
		System.out.println("A rhombus has 4 sides.");
		return K * diagnol1 * diagnol2;

	}
}

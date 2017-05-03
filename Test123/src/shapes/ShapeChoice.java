package shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeChoice {

	public static void main(String[] args) throws IOException {
		String choice = null;
		Shape quad = null;
		System.out.println("Enter you choice: \n1. Rectangle \n2. Square \n3. Circle \n4. Triangle \n5. Rhombus \n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		choice = reader.readLine();
		switch (choice) {
		case "1": {
			System.out.println("Enter length: \n");
			double l = Double.parseDouble(reader.readLine());
			System.out.println("Enter breadth: \n");
			double b = Double.parseDouble(reader.readLine());
			quad = new Rectangle(l, b);
			// System.out.println("Area of the rectangle is: " +
			// rectangle.calArea());
		}
			break;
		case "2": {
			System.out.println("Enter side length: \n");
			double l = Double.parseDouble(reader.readLine());
			quad = new Square(l);
			// System.out.println("Area of the square is: " + square.calArea());
		}
			break;
		case "3": {
			System.out.println("Enter radius: \n");
			double r = Double.parseDouble(reader.readLine());
			quad = new Circle(r);
			// System.out.println("Area of the circle is: " + circle.calArea());
		}
			break;
		case "4": {
			System.out.println("Enter height: \n");
			double l = Double.parseDouble(reader.readLine());
			System.out.println("Enter base: \n");
			double b = Double.parseDouble(reader.readLine());
			quad = new Triangle(l, b);
			// System.out.println("Area of the triangle is: " +
			// triangle.calArea());
		}
			break;
		case "5": {
			System.out.println("Enter diagnol1 length: \n");
			double d1 = Double.parseDouble(reader.readLine());
			System.out.println("Enter diagnol2 length: \n");
			double d2 = Double.parseDouble(reader.readLine());
			quad = new Rhombus(d1, d2);
			// System.out.println("Area of the rhombus is: " +
			// rhombus.calArea());
		}
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5"))
			System.out.println("Area of the rhombus is: " + quad.calArea());
	}

}

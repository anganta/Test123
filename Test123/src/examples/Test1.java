package examples;

public class Test1 {

	private static final double pi = 3.14;

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = calSum(numbers);
		int radius = 5;
		double area = pi * radius * radius;
		System.out.println("Area is:" + area);
		System.out.println(sum);
	}

	private static int calSum(int[] numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}

}

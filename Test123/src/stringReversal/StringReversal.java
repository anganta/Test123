package stringReversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author anganta
 *
 */
public class StringReversal {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String name = null;

		System.out.print("Enter your name: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		name = reader.readLine();
		nameReversal(name);
	}

	private static void nameReversal(String name) {
		String revName;
		revName = new StringBuffer(name).reverse().toString();
		System.out.println("The reverse of your name is: " + revName);
	}

}

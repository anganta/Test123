package stringEndingWith$;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public void findWords(String filename) throws IOException {
		String line;
		int wordCount = 0;
		String pattern = "\\$$"; // regular expression for ends with $
		Pattern r = Pattern.compile(pattern);
		// open input file
		FileReader reader = new FileReader(filename);
		BufferedReader in = new BufferedReader(reader);
		// read each line from the file
		line = in.readLine(); // read first
		while (line != null) {
			// \\s is regular expression for whitespace.
			// splitting each line at whitespace to extract words
			String[] words = line.split("\\s");
			for (int i = 0; i < words.length; i++) {
				Matcher m = r.matcher(words[i]);
				if (m.find())
					wordCount++;
			}

			line = in.readLine(); // read next line
		}
		System.out.println(wordCount + " words ending with $ from file");
		in.close();
	}

	public static void main(String[] args) throws IOException {
		Test myFile = new Test();
		myFile.findWords("/Users/anganta/git/LocalPracticeRepository/Test123/src/stringEndingWith$/words");
	}

}

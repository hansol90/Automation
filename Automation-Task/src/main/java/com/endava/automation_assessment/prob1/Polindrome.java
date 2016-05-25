package com.endava.automation_assessment.prob1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Polindrome {

	public static boolean isPolindrome(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPolindrome(s.substring(1, s.length() - 1));
		return false;
	}

	public static void main(String[] args) throws IOException, URISyntaxException {
		ReadFile readFile = new ReadFile();
		String input = readFile.readResourceFile("InputWords.txt");
		Path path = Paths.get("src/main/resources/Output.txt");

		if (isPolindrome(input))

			try (BufferedWriter writer = Files.newBufferedWriter(path)) {
				writer.write(input + " : is a palindrome");
			}
		else
			try (BufferedWriter writer = Files.newBufferedWriter(path)) {
				writer.write(input + " : is not a palindrome");
			}
	}
}

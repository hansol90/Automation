package com.endava.library.automation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Polindrome {

	private static final Logger LOGGER = Logger.getLogger(Polindrome.class);
	
	public static boolean isPolindrome(String s){
		if(s.length() == 0 || s.length() == 1)
			return true;
		if(s.charAt(0) == s.charAt(s.length()-1))
			return isPolindrome(s.substring(1, s.length()-1));
		return false;
	}
	
	/*public static void main(String[]args) throws IOException, URISyntaxException
    {
		String[] result = null;
		ReadFile readFile = new ReadFile();
        //System.out.println("Enter the String for check:");
		String input = readFile.readResourceFile("InputWords.txt");
		result = input.split(",");
        if(isPolindrome(input))
            System.out.println(input + " is a palindrome");
        else
            System.out.println(input + " is not a palindrome");
    }*/
	
	
	
	//input/output in consola
	
	 /*public static void main(String[]args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the String for check:");
	        String string = scanner.nextLine();
	        if(isPolindrome(string))
	            System.out.println(string + " is a palindrome");
	        else
	            System.out.println(string + " is not a palindrome");
	    }
	*/

	/*public String[] readInputWords() {
		String[] result = null;
		try {
			ReadFile readFile = new ReadFile();
			String input = readFile.readResourceFile("InputWords.txt");
			result = input.split(",");
		} catch (IOException e) {
			LOGGER.error(e);
		} catch (URISyntaxException e) {
			LOGGER.error(e);
		}
		return result;
	}

	public void writeOutputResults(List<String> lines) {
		try {
			WriteFile writeFile = new WriteFile();
			writeFile.writeToResourceFile(lines, "OutputResults.txt");
		} catch (IOException e) {
			LOGGER.error(e);
		} catch (URISyntaxException e) {
			LOGGER.error(e);
		}
	}*/
}

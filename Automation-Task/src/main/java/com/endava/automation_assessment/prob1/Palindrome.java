package com.endava.automation_assessment.prob1;

public class Palindrome {
	// Non Recursive method:

	public static boolean isPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < n / 2; i++)
			if (s.charAt(i) != s.charAt(n - i - 1))
				return false;
		return true;

	}

	public static String builtResponse(String word, Boolean isPalindrome) {
		if (isPalindrome) {
			return word + " - palindrome";
		} else {
			return word + " - not palindrome";
		}
	}

	// Recursive method:

	// if (s.isEmpty())
	// return false;
	//
	// if (s.length() == 0 || s.length() == 1)
	// return true;
	// if (s.charAt(0) == s.charAt(s.length() - 1))
	// return isPalindrome(s.substring(1, s.length() - 1));
	// return false;
	// }



}

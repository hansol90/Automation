package com.endava.library.automation;

import java.util.Scanner;

public class Polindrome2 {

	public static boolean isPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
	
	 public static void main(String[]args)
	    {
	    	//For capturing user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the String for check:");
	        String string = scanner.nextLine();
	        /* If function returns true then the string is
	         * palindrome else not
	         */
	        if(word(string))
	            System.out.println(string + " is a palindrome");
	        else
	            System.out.println(string + " is not a palindrome");
	    }

	private static boolean word(String string) {
		// TODO Auto-generated method stub
		return false;
	}
	 
	}


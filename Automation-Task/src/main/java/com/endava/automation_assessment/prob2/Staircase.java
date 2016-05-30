package com.endava.automation_assessment.prob2;

import java.util.Scanner;

public class Staircase {

	/*public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:");
		int x = in.nextInt();

		Staircase staircase = new Staircase();
		String result = staircase.computeStaircase(x);
		System.out.println(result);
	}*/

	public String computeStaircase(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("Invalid number!");
		}
		StringBuilder builder = new StringBuilder();
		for (int j = 1; j <= number; j++) {
			for (int i = 0; i < j; i++) {
				for (i = number - 1; i >= j; i--) {
					// System.out.print(" ");
					builder.append(" ");
				}
				for (int /* k=1 */k = 0; k <= (/* 2 **/ j - 1); k++) {
					// System.out.print("#");
					builder.append("#");
				}
				// System.out.println();
				builder.append("\r\n");
			}
		}
		return builder.toString();
	}
}

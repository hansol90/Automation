package com.endava.automation_assessment.prob2;
//Drawing a staircase structure - given the required height,
//output a staircase as shown in the example

public class Staircase {

	public static String computeStaircase(int number) {
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
				//next commented "k=1" & "2*" are for drawing a tree.
				for (int /* k=1 */k = 0; k <= (/* 2 **/ j - 1); k++) {
					// System.out.print("#");
					builder.append("#");
				}
				// System.out.println();
				builder.append("\r\n");
			}
		}
		if (builder.length()>=2){
			builder.delete(builder.length()-2, builder.length());
		}
		return builder.toString();
	}
}

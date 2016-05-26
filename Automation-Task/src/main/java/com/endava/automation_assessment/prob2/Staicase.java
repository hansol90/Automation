package com.endava.automation_assessment.prob2;

import java.util.Scanner;

public class Staicase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:");
		int x = in.nextInt();

		for (int j = 1; j <= x; j++) {
			for (int i = 0; i < j; i++)
				for (i = x - 1; i >= j; i--)
					System.out.print(" ");
			for (int /* k=1 */k = 0; k <= (/* 2 **/ j - 1); k++)
				System.out.print("#");
			System.out.println();
			if (x <= 0)
				System.out.print("Invalid number!");
		}
	}
}

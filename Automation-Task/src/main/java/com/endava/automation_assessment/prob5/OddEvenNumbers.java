package com.endava.automation_assessment.prob5;

import java.util.Arrays;
import java.util.List;

public class OddEvenNumbers {
	public static List<Integer> compute(List<Integer> numbers) {
		Integer oddSum = 0, evenAmount = 0;
		for (Integer n : numbers) {
			if (n % 2 == 0) {
				oddSum += n;
			} else {
				evenAmount++;
			}
		}
		return Arrays.asList(oddSum, evenAmount);
	}
}

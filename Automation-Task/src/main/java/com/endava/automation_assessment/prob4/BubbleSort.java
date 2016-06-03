package com.endava.automation_assessment.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an array of integers, implement the BubbleSort algorithm 
//for sorting the elements of the array

public class BubbleSort {
	public static List<Integer> compute(List<Integer> numbers) {
	   		
		for(int i = numbers.size()-1; i >= 0; i--) {
	        for(int j = 0; j < i; j++) {
	            if(numbers.get(j) > numbers.get(j + 1)) {
	                int temp = numbers.get(j);
	                numbers.set(j, numbers.get(j + 1));
	                numbers.set(j + 1, temp);
	            }
	        }
	    }
		return Arrays.asList();
	}

	}
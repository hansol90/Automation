package com.endava.automation_assessment.prob3;

import java.util.ArrayList;
import java.util.List;
//Given an array of floating point numbers, inverse the elements of the array

public class ReverseArray {

	public static List<Double> reverseList(List<Double> inputList) {
		List<Double> resultList = new ArrayList<Double>(inputList.size());
		for(int i = inputList.size()-1; i >= 0; i--) {
			resultList.add(inputList.get(i));
		}
		return resultList;
	}

}



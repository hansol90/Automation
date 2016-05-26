package com.endava.automation_assessment.prob3;

import java.util.Arrays;
import java.util.Collections;

public class ReversArray {

	public static void main(String[] args) {
		
		double[] dbArray = {2.0, 3.0, 4.0, 5.0};
		Double[] dBArray = new Double[dbArray.length];
		int i = 0;

		for(Double db : dbArray){
		    dBArray[i] = db; i++;
		}
		Arrays.sort(dBArray, Collections.reverseOrder());
		System.out.println();
		System.out.println();

	}

}

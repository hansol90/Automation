package com.endava.automation_assessment.prob6;

import java.awt.event.InputMethodListener;
import java.util.Arrays;
import java.util.List;

//Given an integer n, determine the number pi 
//with an error less than n decimal places

public class Pi {
	public static void main(String[] args) {

	//public static String computePi(int number)	{
		double pi = Math.PI;
		int number = 4;
		String decimalNumbers = "%." + number + "f%n";

		System.out.format(decimalNumbers, pi);
		//return decimalNumbers.toString();

		// return Arrays.asList(decimalNumbers);

	}}

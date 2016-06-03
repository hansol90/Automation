package com.endava.automation_assessment.prob8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Given an integer n, determine all prime numbers smaller than n

public class PrimeNumbers {
	
public static void main(String[] args) {
	isPrime();
	
}	public static boolean isPrime() {
	int n = 6;
	for (int i = 3; i * i <= n; i += 2) {
		if (n % i == 0) {
			System.out.println("-");;
		}
	}
	System.out.println("+");;
	return false;
}}
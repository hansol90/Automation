package com.endava.automation_assessment.prob2;

import java.util.Scanner;

public class Staicase {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
         
	        System.out.print("Enter number from 1 to 8:");
	        int x= in.nextInt();
	         
	            for(int j=1;j<=x;j++)
	        {    
	            for(int i=0;i<j;i++) System.out.print("*");
	            System.out.println();
	        }
	             
	            if (x<=0) //&& x>10)
	                System.out.print("Invalid number!");
	            else
	                System.out.print("Enter number from 1 to 8:");
		    
	
		  }

	}


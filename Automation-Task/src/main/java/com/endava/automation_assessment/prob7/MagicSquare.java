package com.endava.automation_assessment.prob7;
//Write a program that will check if
//a two-dimensional arrays is magical square or not

public class MagicSquare {
	 public static void main(String[] args) { 
	        
	    	int[][] square = {{7, 12, 1, 14}, 
	        			   {2, 13, 8, 11},
	        			   {16, 3, 10, 5}, 
	        			   {9, 6, 15, 4}};
	        
	        boolean result = isMagicSquare(square);
	        if (result) {
	            System.out.println("Is a Magic square.");
	        } else {
	            System.out.println("Is not a Magic square.");
	        }
	    }
 
    public static boolean isMagicSquare(int[][] arr2D) 
    { 
    	int baseSum = sumPDiag(arr2D);
    	
    	if( baseSum != sumSDiag(arr2D) )
		  return false;

    	for( int i = 0; i < arr2D.length; ++i )
    	{
    		if( baseSum != sumRow(arr2D, i) )
    			return false;
    		
    		if( baseSum != sumCol( arr2D, i ) )
    			return false;
    	}
	  return true;  
    }
 
    public static int sumPDiag(int[][] arr) { 
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        } 
        return sum;
    }
 
    public static int sumSDiag(int[][] arr) { 
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][arr.length - 1 - i];
        }
        return sum;
    }
 
    public static int sumRow(int[][] arr, int i) { 
        int sum = 0;
        for (int j = 0; j < arr[i].length; j++) {
            sum = sum + arr[i][j];
        }
        return sum;
    }
 
    public static int sumCol(int[][] arr, int j) { 
        int sum = 0;
        for (int i = 0; i < arr[j].length; i++) {
            sum = sum + arr[i][j];
        }
        return sum;
    }
}
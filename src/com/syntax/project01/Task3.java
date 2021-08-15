package com.syntax.project01;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array of integers. 
		//Develop a program which will calculate the sum of  
		//even and odd numbers for that array.
		
		int[][] twoDArray= {
				{1,2,3,4,5},
				{5,6,7,8,9},
				{4,5,6,7,8}
		};
		
		int sumE=0;
		int sumO=0;
		for (int r=0; r<twoDArray.length; r++){
		    for (int c=0; c<twoDArray[r].length; c++){
		    if (twoDArray[r][c]%2 ==0){
		    	
		sumE+=twoDArray[r][c];
		    } else {
		    	sumO+=twoDArray[r][c];
		    }
		    }
		}
		System.out.println("sum of all even numbers in twoDArray is " +sumE);
		System.out.println("sum of all odd numbers in twoDArray is " +sumO);
	}

}

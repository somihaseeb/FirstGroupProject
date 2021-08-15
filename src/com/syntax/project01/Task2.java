package com.syntax.project01;

public class Task2 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		//Develop a program which will identify/print the even numbers only.
	
		
		int [][] twoDArray= {
				{2,4,5,6,8},
				{3,1,7,5,4},
				{1,3,6,8,9}
		};

		for(int r=0; r<twoDArray.length; r++) {
			for (int c=0; c<twoDArray[r].length; c++) {
				if (twoDArray[r][c]%2==0)
				
				System.out.print(twoDArray[r][c] +" ");
			} 
			
			
			System.out.println();
		}
	}

}

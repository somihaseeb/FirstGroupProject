package com.syntax.project01;

public class Task1 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] twoDArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 0, 0 } };

		int sum = 0;
		for (int r = 0; r < twoDArray.length; r++) {
			for (int c = 0; c < twoDArray[r].length; c++) {

				sum = sum + twoDArray[r][c];
			}
		}
		System.out.println("sum of all integers in twoDArray is " + sum);

	}

}

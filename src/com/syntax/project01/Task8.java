package com.syntax.project01;

public class Task8 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		int largest = 0;
		int secondLargest = 0;
		int[] num = { 55, 77, 88, 100 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
			} else if (num[i] > secondLargest) {
				secondLargest = num[i];
			}
		}
		System.out.println("The 2nd largest number is: " + secondLargest + ".");
		
		
	}

}

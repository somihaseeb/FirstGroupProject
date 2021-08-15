package com.syntax.project01;

public class Task7 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?


		int[] num = { 9, 25, 4, 7, 90, 95 };
		int smallest= num[0];
		
		for (int i=1; i<num.length;i++) {
			if (num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println(smallest);
	     
	
	int largest = num[0];
	
	for (int i=1; i<num.length;i++) {
		if (num[i]>largest) {
			largest=num[i];
		}
	}
	System.out.println(largest);
}

	}



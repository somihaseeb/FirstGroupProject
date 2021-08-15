package com.syntax.project01;

public class Task4 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		int [][] twoDSwap= {
				{23,34,45,67,1},
				{33,44,55,66,7}
		};
		
		int a=10;
		int b=20;
		
		System.out.println("-----before swapping-----");
		System.out.println("First number is "+a);
		System.out.println("Second number is "+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		
		System.out.println("-------after swapping------");
		System.out.println("First number is "+a);
		System.out.println("Second number is "+b);


	}

}

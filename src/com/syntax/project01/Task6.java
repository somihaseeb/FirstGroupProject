package com.syntax.project01;

public class Task6 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int n1=0,n2=1,n3,i;
		System.out.print(n1+ " "+n2);
		for(i=2;i<10;++i) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
			
		}
			
	
		
		
		
	}

}

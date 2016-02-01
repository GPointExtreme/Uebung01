package org.gpoint.rekursion;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(3));

	}
	
	public static int fibonacci(int n) {
		if(n==0) {
			return n;
		}
		else {
			return fibonacci(n-1)+n;
		}
	}

}

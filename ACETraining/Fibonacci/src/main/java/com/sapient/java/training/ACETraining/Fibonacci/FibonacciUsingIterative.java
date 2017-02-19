package com.sapient.java.training.ACETraining.Fibonacci;
/**
 * 
 * @author Nitin
 * Java program to print Fibonacci serier without using Recursion.
 *  Time complexity  :- O(2n)
 */

public class FibonacciUsingIterative {

	public static void main(String[] args) {
		FibonacciUsingIterative fibonacciUsingIterative = new FibonacciUsingIterative();
		fibonacciUsingIterative.printFibo(10);
		 
	}

	void printFibo(int n) {
		System.out.println("Print Fibonacci Series without using Recursion :-");
		for(int i=0; i < n ; i++){
			System.out.println(i +": "+fibo(i));
		}
	}
	
	int fibo(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		
		int first =0;
		int second =1;
		int nth=1;
		
		for (int i = 2; i <=n; i++) {
			nth = first + second;
			first = second;
			second =nth;
		}
		return nth;
	}

}
 
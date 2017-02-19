package com.sapient.java.training.ACETraining.Fibonacci;
/**
 * 
 * @author Nitin
 * Java program to print Fibonacci serier using Recursion.
 *  Time complexity  :- O(2n)
 */	

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		FibonacciUsingRecursion fibonacciUsingRecursion = new FibonacciUsingRecursion();
		fibonacciUsingRecursion.printFibo(10);
		 
	}

	void printFibo(int n) {
		System.out.println("Print Fibonacci Series using Recursion :-");
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
		return fibo(n - 1) + fibo(n - 2);
	}

}
 
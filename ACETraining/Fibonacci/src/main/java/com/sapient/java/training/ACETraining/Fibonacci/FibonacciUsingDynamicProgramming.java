package com.sapient.java.training.ACETraining.Fibonacci;
/**
 * 
 * @author Nitin
 * Java program to print Fibonacci serier using Dynamic programming.
 *  Time complexity  :- O(n)
 */	

public class FibonacciUsingDynamicProgramming {

	public static void main(String[] args) {
		FibonacciUsingDynamicProgramming fibonacciUsingDynamicProgramming = new FibonacciUsingDynamicProgramming();
		fibonacciUsingDynamicProgramming.printFibo(10);
		 
	}

	void printFibo(int n) {
		int [] memory = new int[n+1];
		System.out.println("Print Fibonacci Series using Dynamic programming:-");
		for(int i=0; i < n ; i++){
			System.out.println(i +": "+fibo(i,memory));
		}
	}
	
	int fibo(int n, int[] memory) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}else if(memory[n]> 0) {
			return memory[n];
		}
		memory[n]= fibo(n - 1,memory) + fibo(n - 2,memory);
		return memory[n];
	}

}
 
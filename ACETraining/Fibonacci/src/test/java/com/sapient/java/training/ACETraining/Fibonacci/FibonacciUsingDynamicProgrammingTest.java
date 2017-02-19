package com.sapient.java.training.ACETraining.Fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciUsingDynamicProgrammingTest {

	private FibonacciUsingDynamicProgramming fibonacciUsingDynamicProgramming;
	
	@Before
	public void setUp() throws Exception {
		fibonacciUsingDynamicProgramming = new FibonacciUsingDynamicProgramming();
	}

	@Test
	public void testFiboSuccess() {
		int[]  memory = new int[10];
		//when 
		int fibo = fibonacciUsingDynamicProgramming.fibo(9,memory);
		//then
		assertEquals(34, fibo);
	}
	
	@Test
	public void testFiboNegativeNumberScenario() {
		int[]  memory = new int[10];
		//when 
		int fibo = fibonacciUsingDynamicProgramming.fibo(-9,memory);
		//then
		assertEquals(0, fibo);
	}
	
	@Test
	public void testFiboZeroNumberScenario() {
		int[]  memory = new int[10];
		//when 
		int fibo = fibonacciUsingDynamicProgramming.fibo(0,memory);
		//then
		assertEquals(0, fibo);
	}
	
	@Test
	public void testFiboOneNumberScenario() {
		int[]  memory = new int[10];
		//when 
		int fibo = fibonacciUsingDynamicProgramming.fibo(1,memory);
		//then
		assertEquals(1, fibo);
	}
	
	@Test
	public void testPrintFiboSuccess() {
		//when 
		fibonacciUsingDynamicProgramming.printFibo(10);
	}
	

}

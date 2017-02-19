package com.sapient.java.training.ACETraining.Fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Nitin
 *
 */
public class FibonacciUsingIterativeTest {
	
	private FibonacciUsingIterative fibonacciUsingIterative ;
	
	@Before
	public void setUp() throws Exception {
		fibonacciUsingIterative = new FibonacciUsingIterative();
	}

	@Test
	public void testFiboSuccess() {
		//when 
		int fibo = fibonacciUsingIterative.fibo(9);
		//then
		assertEquals(34, fibo);
	}
	
	@Test
	public void testFiboNegativeNumberScenario() {
		//when 
		int fibo = fibonacciUsingIterative.fibo(-9);
		//then
		assertEquals(0, fibo);
	}
	
	@Test
	public void testFiboZeroNumberScenario() {
		//when 
		int fibo = fibonacciUsingIterative.fibo(0);
		//then
		assertEquals(0, fibo);
	}
	
	@Test
	public void testFiboOneNumberScenario() {
		//when 
		int fibo = fibonacciUsingIterative.fibo(1);
		//then
		assertEquals(1, fibo);
	}
	
	@Test
	public void testPrintFiboSuccess() {
		//when 
		fibonacciUsingIterative.printFibo(10);
	}
	


}
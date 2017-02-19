/**
 * 
 */
package com.sapient.java.training.ACETraining.Fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Nitin
 *
 */
public class FibonacciUsingRecursionTest {

	private FibonacciUsingRecursion fibonacciUsingRecursion ;
	
	@Before
	public void setUp() throws Exception {
		fibonacciUsingRecursion = new FibonacciUsingRecursion();
	}

	@Test
	public void testFiboSuccess() {
		//when 
		int fibo = fibonacciUsingRecursion.fibo(9);
		//then
		assertEquals(34, fibo);
	}
	
	@Test
	public void testFiboNegativeNumberScenario() {
		//when 
		int fibo = fibonacciUsingRecursion.fibo(-9);
		//then
		assertEquals(0, fibo);
	}
	
	@Test
	public void testFiboZeroNumberScenario() {
		//when 
		int fibo = fibonacciUsingRecursion.fibo(0);
		//then
		assertEquals(0, fibo);
	}
	
	@Test
	public void testFiboOneNumberScenario() {
		//when 
		int fibo = fibonacciUsingRecursion.fibo(1);
		//then
		assertEquals(1, fibo);
	}
	
	@Test
	public void testPrintFiboSuccess() {
		//when 
		fibonacciUsingRecursion.printFibo(10);
	}
	

}

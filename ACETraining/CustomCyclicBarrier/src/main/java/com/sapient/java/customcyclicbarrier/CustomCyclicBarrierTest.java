package com.sapient.java.customcyclicbarrier;

public class CustomCyclicBarrierTest {

	public static void main(String[] args) {
		
		CustomCyclicBarrier customCyclicBarrier = new CustomCyclicBarrier(3, new CyclicBarrierEvent());
		
		MyRunnable myRunnable = new MyRunnable(customCyclicBarrier);
		
		new Thread(myRunnable ," Thread -1 ").start();
		new Thread(myRunnable ," Thread -2 ").start();
		new Thread(myRunnable ," Thread -3 ").start();

	}

}

package com.sapient.java.customcyclicbarrier;

public class CyclicBarrierEvent implements Runnable{

	public void run() {
		System.out.println("As all threads have reached common barrier point ");
	}
	

}

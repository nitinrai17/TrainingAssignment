package com.sapient.java.customcyclicbarrier;

public class MyRunnable implements Runnable {
	
	CustomCyclicBarrier customCyclicBarrier;
	
	public MyRunnable(CustomCyclicBarrier customCyclicBarrier) {
		this.customCyclicBarrier= customCyclicBarrier;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+" is awaiting for all other");
		try {
			Thread.sleep(1000);
			customCyclicBarrier.await();
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		System.out.println("common place  :-  "
                + Thread.currentThread().getName() +
                " has been released");
	}

}

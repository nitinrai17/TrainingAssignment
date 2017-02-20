package com.sapient.java.threadpool;

public class Task implements Runnable {

	public void run() {
		try {
			Thread.sleep(8000);
			System.out.println(Thread.currentThread().getName()+" is executing task .");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" Error ");
		}
	}

}

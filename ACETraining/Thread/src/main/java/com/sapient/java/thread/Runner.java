package com.sapient.java.thread;

public class Runner implements Runnable {

	public void run() {
		for (int i = 0;  i <=1000; i++) {
			
			System.out.println(" i="+ i);
			if(i > 999) {
				Thread.yield();
				throw new NullPointerException(" Interupted ");
			}
		}

	}

}

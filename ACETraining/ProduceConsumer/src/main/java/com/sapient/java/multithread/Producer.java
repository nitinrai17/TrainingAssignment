package com.sapient.java.multithread;

import java.util.concurrent.BlockingQueue;

/**
 * @author nrai6
 *
 */
public class Producer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(" Producer = " + i);
				blockingQueue.put(i);
			} catch (InterruptedException e) {
				System.out.println(" Error :- " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

}

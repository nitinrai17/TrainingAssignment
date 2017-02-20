package com.sapient.java.multithread;

import java.util.concurrent.BlockingQueue;

/**
 * @author nrai6
 *
 */
public class Consumer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public Consumer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	public void run() {
		while (true) {
			try {
				int i=blockingQueue.take();
				System.out.println(" Consumer " + i);
				if(i>=9) break;
			
			} catch (InterruptedException e) {
				System.out.println(" Error " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

}

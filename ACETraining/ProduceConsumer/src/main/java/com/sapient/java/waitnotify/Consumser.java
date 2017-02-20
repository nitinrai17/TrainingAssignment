package com.sapient.java.waitnotify;

import java.util.Queue;

public class Consumser implements Runnable {

	private Queue<Integer> queue;
	private int maxSize;

	public Consumser(Queue<Integer> queue, int maxSize) {
		this.maxSize = maxSize;
		this.queue = queue;
	}

	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					try {
						System.out
								.println("Queue is Empty, Consumer is waiting ");
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(" Consume value = "+ queue.remove());
				queue.notifyAll();
			}
		}

	}
}

package com.sapient.java.waitnotify;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
	
	private Queue<Integer> queue;
	private int maxSize;
	
	public Producer(Queue<Integer> queue, int maxSize){
		this.queue = queue;
		this.maxSize= maxSize;
	}

	public void run() {
		while(true){
			synchronized (queue) {
				while(queue.size() == maxSize){
					try {
						System.out.println(" Queue is full , Producer is waiting ...");
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Random random = new Random();
				int nextInt = random.nextInt();
				System.out.println(" Producing value : "+nextInt);
				queue.add(nextInt);
				queue.notifyAll();
			}
		}
	}

}

package com.sapient.java.multithread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsusmer {

	public static void main(String[] args) {
		BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<Integer>(); 
		
		Thread producer = new Thread(new Producer(blockingQueue));
		Thread consumer = new Thread(new Consumer(blockingQueue));
		
		producer.start();
		consumer.start();
	}

}

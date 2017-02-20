package com.sapient.java.semaphore;

public class ProducerConsumerSemaphore {

	public static void main(String[] args) {
		
		MySemaphoreQueue mySemaphoreQueue = new MySemaphoreQueue();
		
		Thread producer = new Thread(new Producer(mySemaphoreQueue));
		Thread consumer = new Thread(new Consumer(mySemaphoreQueue));
		
		producer.start();
		consumer.start();

	}

}

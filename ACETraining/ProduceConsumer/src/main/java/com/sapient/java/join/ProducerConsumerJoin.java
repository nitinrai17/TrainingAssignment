package com.sapient.java.join;

public class ProducerConsumerJoin {

	public static void main(String[] args) {
		
		Buffer buf = new Buffer();
		
		Thread producer = new Thread(new Producer(10, buf));
		Thread consumer = new Thread(new Consumer(10, buf));
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (Exception e) {
			return;
		}
		
	}

}

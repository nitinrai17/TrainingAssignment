package com.sapient.java.waitnotify;

import java.util.LinkedList;
import java.util.Queue;


/**
 * @author nrai6
 *
 */
public class ProducerConsumerWaitNotify {

	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int maxSize= 10;
		
		Thread producer = new Thread(new Producer(queue, maxSize));
		Thread consumer = new Thread(new Consumser(queue,maxSize));
		
		producer.start();
		consumer.start();
		

	}

}

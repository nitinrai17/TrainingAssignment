package com.sapient.java.threadpool;

import java.util.LinkedList;
import java.util.List;

/**
 * @author nrai6
 *
 */
public class LinkedCustomBlockingQueue<E> implements CustomBlockingQueue<E> {
	
	private List<E> queue;
	private int maxSize;
	
	public LinkedCustomBlockingQueue(int maxSize) {
		this.maxSize=maxSize;
		queue = new LinkedList<E>();
	}
	
	public  synchronized void put(E item) throws InterruptedException {
		if(maxSize == queue.size()){
			this.wait();
		}
		queue.add(item);
		this.notifyAll();
	}

	public E take() throws InterruptedException {
		if(queue.size()==0){
			this.wait();
		}
		this.notifyAll();
		return this.queue.remove(0);
	}

	public int size() {
		return queue.size();
	}

}

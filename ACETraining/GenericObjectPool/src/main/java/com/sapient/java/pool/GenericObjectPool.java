package com.sapient.java.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class GenericObjectPool<E> {

	private int size;
	
	private IGeneric<E> object;

	private BlockingQueue<E> queue;

	public GenericObjectPool(int size, IGeneric<E> object ) {
		if(size <=0 || size > 100){
			size=100;
		}else{
			this.size=size;
		}
		queue = new LinkedBlockingDeque<E>(size);
	}
	
	public E takeObject() throws InterruptedException{
		return queue.take();
	}
	
	public void putObject(E object) throws InterruptedException{
		queue.put(object);
	}
	
	public void initilized(){
		for (int i = 0; i < size; i++) {
			queue.add(object.createObject());
		}
	}

}

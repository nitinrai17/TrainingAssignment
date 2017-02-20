package com.sapient.java.join;

public class Buffer {
	
	private int content;
	private boolean empty = true;
	
	public synchronized int get(){
		while(empty == true){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		notify();
		int val= content;
		System.out.println(" Consumer : get "+ val);
		return val;
	}
	
	public synchronized void put(int i){
		while(empty == false){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		content= i;
		empty=false;
		System.out.println(" Producer: put "+i );
		notify();
	}

}

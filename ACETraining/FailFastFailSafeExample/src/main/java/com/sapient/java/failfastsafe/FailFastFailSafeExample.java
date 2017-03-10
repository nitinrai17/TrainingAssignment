package com.sapient.java.failfastsafe;

import java.util.Iterator;
import java.util.Vector;

public class FailFastFailSafeExample {

	public static void main(String[] args) {
		Vector<Integer> lisIntegers = new Vector<Integer>();
		lisIntegers.add(1);
		lisIntegers.add(4);
		lisIntegers.add(3);
		/*new Thread(new MyThread(lisIntegers, true)).start();
		new Thread(new MyThread(lisIntegers, false)).start();*/
		
		
		
		Iterator<Integer> iterator = lisIntegers.iterator();
//		Iterator<Integer> iterator1 = lisIntegers.iterator();
		
		iterator.next();
		iterator.remove();
		while(iterator.hasNext()){
			System.out.println(" "+iterator.next());
		}
		

	}

}

class MyThread implements Runnable{

	
	private Vector<Integer> integerList;
	private boolean isWrite;
	
	
	
	public MyThread(Vector<Integer> integerList, boolean isWrite) {
		super();
		this.integerList = integerList;
		this.isWrite = isWrite;
	}



	public void run() {
		if(isWrite){
			integerList.add(2);
			System.out.println(" Integer Add");
		} else {
			integerList.remove(0);
			System.out.println(" Integer Removed");
		}
		
	}
	
}

package com.sapient.java.customcounter;

public class CustomCounter {
	
	private static volatile int counter=0;
	
	public static int incrementCounter(){
		synchronized (CustomCounter.class) {
			counter++;
			return counter;
		}
		
	}
}

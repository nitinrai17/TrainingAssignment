package com.sapient.java.memory;

public class CalculateMemory {

	public static void main(String[] args) {
		callGC();
		callGC();
		callGC();
		long freeMemory = Runtime.getRuntime().freeMemory();
		System.out.println(freeMemory);
		Object o  = new Object();
		
		callGC();
		callGC();
		callGC();
		long freeMemoryafter = Runtime.getRuntime().freeMemory();
		System.out.println(freeMemoryafter);
		System.out.println(freeMemoryafter -freeMemory);
		
	}

	private static void callGC() {
		System.gc();
	}
}

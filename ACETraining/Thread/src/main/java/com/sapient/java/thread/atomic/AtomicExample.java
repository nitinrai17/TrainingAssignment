package com.sapient.java.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

	public static void main(String[] args) {
		AtomicInteger at  = new AtomicInteger(23);
		System.out.println(at.get());
		at.getAndSet(200);
		System.out.println(at.get());
		at.compareAndSet(23, 300);
		System.out.println(at.get());
	}

}

package com.sapient.java.thread;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

	static String s =new String("Hello");
	static List list = new ArrayList();
	public static void main(String[] args) {
		for(;;){
			s = new String("Hi");
			list.add(s);
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" Calling finalized ");
	}
}

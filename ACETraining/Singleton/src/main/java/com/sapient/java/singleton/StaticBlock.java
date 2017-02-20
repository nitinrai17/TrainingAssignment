package com.sapient.java.singleton;

public class StaticBlock {

	
	private int j =0;
	
	{ i=20;
		j=100;}
	
	
	
	{ i=20;}
	
	static{ i=50;}
	static{ i=30;}
	
	public static void main(String[] args) {
		 System.out.println(i);
		 System.out.println(new StaticBlock().j);

	}
	private static int i=10;
	
	static{ i=30;}
}

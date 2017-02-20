package com.sapient.java.abstractclass;

public  class AbsClass {

	public static void main(String[] args) {
		B b = new B();
		
	}
	
	public final void overload(int i ){
		
	}
	
	public final void overload(double i ){
		
	}
}

abstract class  A { 
	int i =0;
	
	public A(){
		System.out.println(" Class A ");
	}
		
}


class B extends A{
	
	public B(){
		System.out.println(" Class B");
	}
	
}

class C extends B {
	
	 final int i ;
	
	{ i =100;}
	
}

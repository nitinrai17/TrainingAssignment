package com.sapient.java;

import java.util.Date;

public class Java8Examples2{

	public static void main(String[] args) {
		Java8Examples2 objClass = new Java8Examples2();
		X.getDate();
		
		Iface i =()->System.out.println("Add");
		Iface i1 =()->objClass.instanceMethod1();
		Iface i2 =objClass::instanceMethod2;
		
		i.add();
		i1.add();
		i2.add();
		 
	}

	public void instanceMethod1(){System.out.println("instanceMethod1");}
	public void instanceMethod2(){System.out.println("instanceMethod2");}

}

interface X {
	
	static void getDate(){
		System.out.println(" Date ="+ new Date());
	}
}

interface Iface{
	public void add();
}

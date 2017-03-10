package com.sapient.java;

import java.util.Date;

public class Java8ConstrutorRef{

	public static void main(String[] args) {
		Java8ConstrutorRef objClass = new Java8ConstrutorRef();
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



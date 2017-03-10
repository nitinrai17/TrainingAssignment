package com.sapient.java.failfastsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class FailFastFailSafeExample2 {

	public static void main(String[] args) {
		List<Integer> lisIntegers = new ArrayList();
		lisIntegers.add(1);
		lisIntegers.add(2);
		lisIntegers.add(3);
		
		
		
		Iterator<Integer> iterator = lisIntegers.iterator();
//		Iterator<Integer> iterator1 = lisIntegers.iterator();
		
		while(iterator.hasNext()){
			System.out.println(" "+iterator.next());
			lisIntegers.remove(2);
		}
		

	}

}


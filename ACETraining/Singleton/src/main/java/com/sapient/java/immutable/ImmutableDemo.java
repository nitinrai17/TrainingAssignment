package com.sapient.java.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableDemo {
	
	private final int id; 

	private final String text;
	
	private final HashMap<String,String> testMap;
	
	public ImmutableDemo(int id, String text, HashMap<String, String> hm) {
		
		this.id = id;
		this.text = text;
		HashMap<String,String> tempHashMap = new HashMap<String, String>();
		String key;
		Iterator<String> iterator = hm.keySet().iterator();
		while(iterator.hasNext()){
			key= iterator.next();
			tempHashMap.put(key,hm.get(key));
			
		}
		this.testMap = tempHashMap;
	}

	public String getText(){
		return text; 
	}
	
	public int getId() {
		return id;
	}

	public HashMap<String, String> getTestMap() {
		return (HashMap<String,String>)testMap.clone();
	}
	
	
	public static void main(String[] args) {
		HashMap<String,String> h1 = new HashMap<String, String>();
		h1.put("1","first");
		h1.put("2","second");
		
		String text = "original";
		int id=10;
		
		ImmutableDemo im = new ImmutableDemo(id, text, h1);
		//Lets see whether its copy by field or reference
		System.out.println(text==im.getText());
		System.out.println(h1 == im.getTestMap());
		//print the ce values
		System.out.println("im id:"+im.getId());
		System.out.println("im text:"+im.getText());
		System.out.println("im testMap:"+im.getTestMap());
		//change the local variable values
		id=20;
		text="modified";
		h1.put("3", "third");
		//print the values again
		System.out.println("ce id after local variable change:"+im.getId());
		System.out.println("ce name after local variable change:"+im.getText());
		System.out.println("ce testMap after local variable change:"+im.getTestMap());
		
		HashMap<String, String> hmTest = im.getTestMap();
		hmTest.put("4", "new");
		
		System.out.println("ce testMap after changing variable from accessor methods:"+im.getTestMap());
		
	}
	
}

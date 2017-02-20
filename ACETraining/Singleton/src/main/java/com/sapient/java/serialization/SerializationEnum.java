package com.sapient.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEnum {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("day.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Days d = Days.MONDAY;
			oos.writeObject(d);
			oos.close();
			fos.close();
			/* deserialized */
			
			FileInputStream fis = new FileInputStream("day.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Days d_= (Days) ois.readObject() ;
			System.out.println(d_.name());
			
		} catch (Exception e) {
			
		}
		
	}

}

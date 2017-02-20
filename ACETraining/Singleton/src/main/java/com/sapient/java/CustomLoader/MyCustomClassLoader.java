package com.sapient.java.CustomLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Class;
import java.lang.ClassLoader;
import java.lang.ClassNotFoundException;
import java.lang.Override;
import java.lang.String;
import java.lang.System;
import java.util.Hashtable;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class MyCustomClassLoader extends ClassLoader {

	private String jarFile = "E:/dummy.jar";
	private Hashtable classes = new Hashtable(); // used to cache already
													// defined classes

	public MyCustomClassLoader() {
		super();

	}

	@Override
	protected Class<?> loadClass(String name, boolean resolve)
			throws ClassNotFoundException {
		return findClass(name, resolve);
	}

	public Class findClass(String className, boolean resolveIt) {
		byte classByte[];
		Class result = null;
		result = (Class) classes.get(className); // checks in cached classes
		if (result != null) {
			return result;
		}

		/*
		 * try { return findSystemClass(className); //first try to load this
		 * using System Classloaders } catch (ClassNotFoundException e) {
		 * System.out.println("ClassNotFoundException[ "+className+
		 * " not found by system classloaders]"); }
		 */
		try {
			JarFile jar = new JarFile(jarFile);
			JarEntry entry = jar.getJarEntry(className + ".class");
			InputStream is = jar.getInputStream(entry);
			ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
			int nextValue = is.read();
			while (-1 != nextValue) {
				byteStream.write(nextValue);
				nextValue = is.read();
			}
			classByte = byteStream.toByteArray(); // load the class
			result = defineClass(className, classByte, 0, classByte.length,
					null); // Create a class instance

			if (resolveIt) {
				resolveClass(result); // do the linking
			}
			classes.put(className, result);

			System.out.println("Custom class loader 1");
			return result;
		} catch (IOException e) {
			System.out.println("there is a problem in reading the jar file "
					+ e.getMessage());
		}
		return null;
	}
}

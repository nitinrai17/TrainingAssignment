package com.sapient.java.equalshashcode;

import java.util.HashMap;

public class EqualsHashCodeExample2 {
	
	public static void main(String[] args) {
		HashMap<EmployeeImmutuable, Integer> hm1 = new HashMap<EmployeeImmutuable,Integer>();
		EmployeeImmutuable emp1 = new EmployeeImmutuable(1,"abc");
		EmployeeImmutuable emp2 = new EmployeeImmutuable(1,"abc");
		hm1.put(emp1, 1);
		hm1.put(emp2, 2);
		System.out.println(" Immutubale Size ="+hm1.size());
		
		HashMap<EmployeeMutuable, Integer> hm2 = new HashMap<EmployeeMutuable,Integer>();
		EmployeeMutuable emppl1 = new EmployeeMutuable(1,"abc");
		EmployeeMutuable emppl2 = new EmployeeMutuable(1,"abc");
		hm2.put(emppl1, 1);
		hm2.put(emppl2, 2);
		System.out.println(" mutubale Size ="+hm2.size());
		
		emp1 = new EmployeeImmutuable(1,"abc");
		System.out.println(" Immutuable get := "+hm1.get(emp1));
		
		emppl1.setName("xyz");
		System.out.println("mutuable get = " +hm2.get(emppl1) );
	}
	
}

class EmployeeMutuable {
	
	int id ;
	String name;
	
	public EmployeeMutuable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeMutuable other = (EmployeeMutuable) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

final class EmployeeImmutuable { 
	
	private final int id ;
	private final String name;
	
	public EmployeeImmutuable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeImmutuable other = (EmployeeImmutuable) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

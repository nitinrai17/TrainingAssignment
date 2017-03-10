package com.sapient.java.equalshashcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class EqualsHashCodeExample1 {

	public static void main(String[] args) {
		
		HashMap<Product,Integer> hm  = new HashMap<Product,Integer>(); 
		Product pr1=  new Product(100,"First");
		Product pr2=  new Product(100,"First");
		Product pr3=  new Product(200,"Third");
		Product pr4=  new Product(300,"Four");
		
		List<Product> list = new ArrayList<Product>();
		list.add(pr1);
		list.add(pr2);
		list.add(pr3);
		list.add(pr4);
		
		Collections.sort(list,new Comparator<Product>() {

			public int compare(Product o1, Product o2) {
				
				if(null!= o1 && null!=o2 ){
					int result = o1.id-o2.id + o2.name.compareTo(o1.name) ;
					return result;  
				}		
				return -1;
			}

			public Comparator<Product> reversed() {
				// TODO Auto-generated method stub
				return null;
			}

			public Comparator<Product> thenComparing(
					Comparator<? super Product> other) {
				// TODO Auto-generated method stub
				return null;
			}

			public <U extends Comparable<? super U>> Comparator<Product> thenComparing(
					Function<? super Product, ? extends U> keyExtractor,
					Comparator<? super U> keyComparator) {
				// TODO Auto-generated method stub
				return null;
			}

			public <U extends Comparable<? super U>> Comparator<Product> thenComparing(
					Function<? super Product, ? extends U> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public Comparator<Product> thenComparingInt(
					ToIntFunction<? super Product> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public Comparator<Product> thenComparingLong(
					ToLongFunction<? super Product> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public Comparator<Product> thenComparingDouble(
					ToDoubleFunction<? super Product> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T> Comparator<T> nullsFirst(
					Comparator<? super T> comparator) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T> Comparator<T> nullsLast(
					Comparator<? super T> comparator) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T, U> Comparator<T> comparing(
					Function<? super T, ? extends U> keyExtractor,
					Comparator<? super U> keyComparator) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
					Function<? super T, ? extends U> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T> Comparator<T> comparingInt(
					ToIntFunction<? super T> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T> Comparator<T> comparingLong(
					ToLongFunction<? super T> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <T> Comparator<T> comparingDouble(
					ToDoubleFunction<? super T> keyExtractor) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
		
		
		
		
		
		pr2.name="Change";
		
		System.out.println(" Value = "+hm.get(pr2));
		System.out.println(" Size = "+ hm.size());

	}

}

class Product implements Comparator<Product>{ 
	
	 int id; 
	 String name;
	
	public Product(int id, String name) {
		super();
		this.id = id;
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
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compare(Product o1, Product o2) {
		if(null!= o1 && null!=o2 ){
			int result = o1.id-o2.id + o2.name.compareTo(o1.name) ;
			return result;  
		}		
		return -1;
	}

	public Comparator<Product> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Product> thenComparing(Comparator<? super Product> other) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U extends Comparable<? super U>> Comparator<Product> thenComparing(
			Function<? super Product, ? extends U> keyExtractor,
			Comparator<? super U> keyComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U extends Comparable<? super U>> Comparator<Product> thenComparing(
			Function<? super Product, ? extends U> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Product> thenComparingInt(
			ToIntFunction<? super Product> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Product> thenComparingLong(
			ToLongFunction<? super Product> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Product> thenComparingDouble(
			ToDoubleFunction<? super Product> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsLast(Comparator<? super T> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T, U> Comparator<T> comparing(
			Function<? super T, ? extends U> keyExtractor,
			Comparator<? super U> keyComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
			Function<? super T, ? extends U> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingInt(
			ToIntFunction<? super T> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingLong(
			ToLongFunction<? super T> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingDouble(
			ToDoubleFunction<? super T> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	/*public boolean equals(Object obj) {
		
		return true;
	}
	
	public int hashCode(){
		return 1;
	}*/
	
		
	
}



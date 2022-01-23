package prgHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<String>(); 
		lh.add("HashSet");
		lh.add("TreeSet");
		lh.add("LinkeHashSet");
		
		System.out.println();
		System.out.println("----Using LinkedHashSet----");
	
		Iterator h=lh.iterator();
		while(h.hasNext()) {
			Object o=h.next();
			System.out.println(o);
		}

	}

}

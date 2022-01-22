package prgHashset;
import java.util.*;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;
public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<String,Integer> ht= new Hashtable<String,Integer>();
		
		boolean isEmpty=ht.isEmpty();
		System.out.println("Table is Empty? = "+isEmpty);
				
		ht.put("Peter", 20);
		ht.put("Jhonshan", 40);
		ht.put("Deep", 15);
		ht.put("Matthew", 45);
		ht.put("Paul", 30);
		
		System.out.println("Iterating Keys of hash table");
		Iterator itr= (Iterator) ht.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		 Integer removeE = ht.remove("Deep");
		 System.out.println("Removed entry: " +removeE);
		 System.out.println("Updated entries in hash table: " +ht);
		 
		 boolean containsKey = ht.containsKey("Paul");
		   System.out.println("Is key Paul in hash table: " +containsKey);
	}

}

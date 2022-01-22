package prgHashset;

import java.util.*;

public class SetDemo {
		public static void main(String[] args) {
			//HashSet doesn’t maintain any kind of order of its elements.
			//TreeSet sorts the elements in ascending order.
			//LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence in which they have been added to the Set.
			
			//HashSet for String
			HashSet<String> hs=new HashSet<String>();
			hs.add("HashSet");
			hs.add("TreeSet");
			hs.add("LinkedHashSet");
			
			System.out.println("----Using HashSet----");
			
			Iterator i=hs.iterator();
			while(i.hasNext()) {
				Object o=i.next();
				System.out.println(o);
			}
			
			//TreeSet 
			TreeSet ts=new TreeSet();
			ts.add("HashSet");
			ts.add("TreeSet");
			ts.add("LinkedHashSet");
			
			System.out.println();
			System.out.println("----Using TreeSet----");
		
			Iterator t=ts.iterator();
			while(t.hasNext()) {
				Object o=t.next();
				System.out.println(o);
			}
			
			//LinkedHashSet
			LinkedHashSet<String> lh = new LinkedHashSet<String>(); 
			lh.add("HashSet");
			lh.add("TreeSet");
			lh.add("LinkedHashSet");
			
			System.out.println();
			System.out.println("----Using LinkedHashSet----");
		
			Iterator h=lh.iterator();
			while(h.hasNext()) {
				Object o=h.next();
				System.out.println(o);
			}

	}

}

package prgHashset;

import java.util.*;

public class Sorttset {

	public static void main(String[] args) {
		Set hs=new TreeSet();
		hs.add("Hash");
		hs.add("Set");
		hs.add("Demo");
		hs.add("Demo");
		
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}
	}

}

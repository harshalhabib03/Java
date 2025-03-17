package FailFastEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
	
	//Fail Fast HashMap collection
	
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "one");
		m.put(102, "two");
		m.put(103, "three");
		
		//System.out.println(m);
		
		Set<Integer> keySet = m.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			m.put(104, "four");	//ConcurrentModificationException
		}
	}
}

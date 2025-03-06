package HashSetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add(null);
		System.out.println(hs);
		
		hs.remove("three");
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

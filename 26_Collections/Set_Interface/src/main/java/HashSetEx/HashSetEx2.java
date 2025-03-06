package HashSetEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>(100, 10.05f);
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add(null);
		
		System.out.println(hs);
		
	}
}

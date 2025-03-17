package HashMapEx;

import java.util.WeakHashMap;

public class WeakHashMapEx {

	public static void main(String[] args) {
		
		WeakHashMap<String, Integer> whm = new WeakHashMap<String, Integer>();
		whm.put("one", 101);
		whm.put("two", 102);
		whm.put("three", 103);
		
		System.out.println(whm);
		

	}

}

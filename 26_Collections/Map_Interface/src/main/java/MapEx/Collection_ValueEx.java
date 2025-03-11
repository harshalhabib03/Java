package MapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collection_ValueEx {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "John");
		m.put(102, "Smith");
		m.put(103, "Amith");
		
		Collection<String> values = m.values();
		for (String v : values) {
			System.out.println(v);
		}

	}

}

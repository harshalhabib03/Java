package MapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Key_SetEx {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "John");
		m.put(102, "Smith");
		m.put(103, "Amith");
		
		Set<Integer> keySet = m.keySet();
		for (Integer key : keySet) {
			System.out.print(key+" - ");
			System.out.println(m.get(key));
		}

	}

}

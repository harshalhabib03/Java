package MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Entry_SetEx {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "John");
		m.put(102, "Smith");
		m.put(103, "Amith");
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		
		while (itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		
		for (Entry<Integer, String> e : entrySet) {
			System.out.println(e.getKey()+" - "+e.getValue());
		}

	}

}

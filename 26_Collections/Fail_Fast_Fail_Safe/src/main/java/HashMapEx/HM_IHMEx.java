package HashMapEx;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HM_IHMEx {
	public static void main(String[] args) {
		
		//Difference between HashMap And IdentityHashMap
		
		//HashMap uses equals() to compare content of keys to find duplicates
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("ashok", 101);
		hm.put("smith", 102);
		hm.put("ravi", 103);
		hm.put((new String("ashok")), 104);
		//here, it will replace first entry bcz key is duplicate
		
		System.out.println("HM Size: "+hm.size());
		System.out.println(hm);
		
		System.out.println("==============================");
		
		
		//IdentityHashMap will compares the address of keys using == operator
		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<String, Integer>();
		ihm.put("ashok", 101);
		ihm.put("smith", 102);
		ihm.put("ravi", 103);
		ihm.put((new String("ashok")), 104);	//address will be different here
		//ihm.put("ashok", 105);	//address is same and it will replace the value
		
		
		System.out.println("IHM Size: "+ihm.size());
		System.out.println(ihm);
		
	}
}

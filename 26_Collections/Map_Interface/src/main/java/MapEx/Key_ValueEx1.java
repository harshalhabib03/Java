package MapEx;

import java.util.HashMap;
import java.util.Map;

public class Key_ValueEx1 {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "John");
		m.put(102, "Smith");
		m.put(103, "Amith");
		
		System.out.println(m.get(101));	//John
		System.out.println(m.size());	//3
		System.out.println(m.containsKey(103));	//Amith
		System.out.println(m.containsKey(104));	//null
		
		System.out.println(m);	//String Literal
		
		System.out.println(m.isEmpty());	//bollean value
	}

}

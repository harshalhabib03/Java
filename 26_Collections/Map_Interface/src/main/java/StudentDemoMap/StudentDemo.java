package StudentDemoMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		
		Student s1 = new Student(1, "John");
		Student s2 = new Student(2, "Ramesh");
		Student s3 = new Student(3, "Kabir");
		
		Map<Integer, Student> m = new HashMap<Integer, Student>();
		m.put(1, s1);
		m.put(2, s2);
		m.put(3, s3);
		//System.out.println(m);
		
		//set Interface keySet
		/*Set<Integer> keySet = m.keySet();
		for (Integer key : keySet) {
			System.out.println(m.get(key));
		}
		*/
		
		//EntrySet
		Set<Entry<Integer, Student>> entrySet = m.entrySet();
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}

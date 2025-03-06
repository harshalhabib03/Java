package TreeSetEx;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(40);
		ts.add(30);
		ts.add(20);			//order is maintained
		//ts.add("Hello");	//TreeSet takes only homogeneous data
		//ts.add(null);		//throws NullPointerException
		System.out.println(ts);
		
		TreeSet ts2 = new TreeSet();
		ts2.add("Raja");
		ts2.add("Rani");
		ts2.add("Rahul");
		ts2.add("Rani");
		//ts2.add(10);		//Here, previous object is string so it check
		System.out.println(ts2);
	}

}

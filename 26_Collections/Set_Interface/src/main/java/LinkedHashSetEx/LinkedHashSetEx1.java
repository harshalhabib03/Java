package LinkedHashSetEx;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(null);
		lhs.add(30);
		
		System.out.println(lhs);
	}

}

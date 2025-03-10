package QueueEx;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("One");
		ad.add("two");
		ad.add("three");
		
		System.out.println(ad);		//one two three
		//System.out.println(ad.removeFirst());	//one
		
		ad.pollFirst();
		System.out.println(ad); 	//two three
		
		ad.pollLast();
		System.out.println(ad); 	//two
	}

}

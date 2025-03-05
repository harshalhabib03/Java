package LinkedListEx;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		System.out.println(ll);
		System.out.println(ll.get(0));
		ll.add(1, 15);
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.getLast());
	}

}

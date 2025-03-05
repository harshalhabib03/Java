package ArrayListEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Approach1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("==========For Loop===============");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("===========For Each loop==============");
		
		for (Object obj : al) {
			System.out.println(obj);
		}
		
		System.out.println("===========Iterator==============");
		//iterates only in forward direction
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("===========List Iterator for forward==============");
		//
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("===========List Iterator for backward==============");
		
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		System.out.println("============forEach() loop=============");
		
		al.forEach(i -> System.out.println(i));
		
	}

}

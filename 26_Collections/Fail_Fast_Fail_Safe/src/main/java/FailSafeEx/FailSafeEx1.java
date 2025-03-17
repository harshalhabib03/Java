package FailSafeEx;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeEx1 {

	public static void main(String[] args) {
		//Fail Safe collection
		
		//Concurrent Collection
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		//System.out.println(al);
		
		for (Integer i : al) {
			System.out.println(i);
			if (i == 100) {
				al.add(150);
			}
		}
		System.out.println(al);	
	}

}

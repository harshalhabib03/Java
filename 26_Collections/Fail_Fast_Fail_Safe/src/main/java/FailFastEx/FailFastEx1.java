package FailFastEx;

import java.util.ArrayList;

public class FailFastEx1 {

	public static void main(String[] args) {
		//Fail Fast Collection
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		//System.out.println(al);
		
		for (Integer i : al) {
			if (i == 100) {
				System.out.println(i);
				//al.add(150);	//here we get ConcurrentModificationException
			}
		}
	}

}

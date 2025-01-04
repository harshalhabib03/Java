package SortEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(5);
		al.add(4);
		
		System.out.println("Before sort: "+al);
		//for ascending order
		//Collections.sort(al);
		//for descending order we created new class implementing Comparator
		Collections.sort(al, new NumberComparator());
		System.out.println("After sort: "+al);
	}
}

class NumberComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer i, Integer j) {
		if (i>j) {
			return -1;
		}
		else if (i<j) {
			return 1;
		}
		return 0;
	}
}

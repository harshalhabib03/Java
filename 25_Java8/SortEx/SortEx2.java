package SortEx;

import java.util.ArrayList;
import java.util.Collections;

public class SortEx2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(5);
		al.add(4);
		
		System.out.println("Before sort: "+al);
		//sorts in ascending order using lambda expression
		//Collections.sort(al, (i,j) -> i.compareTo(j));
		
		//using lambda expression to sort in descending order 
		Collections.sort(al, (i,j) -> (i>j) ? -1 : 1);
		System.out.println("After sort: "+al);

	}

}

package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEX1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(3);
		al.add(5);
		al.add(1);
		al.add(2);
		
		System.out.println("Before Sorting: "+al);
		
		//Sort the Collection
		Collections.sort(al);
		
		System.out.println("After Sorting: "+al);
		
		//Reverse the Collection
		Collections.reverse(al);
		System.out.println("After Reverse: "+al);
	}

}

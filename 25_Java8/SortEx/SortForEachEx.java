package SortEx;

import java.util.ArrayList;

public class SortForEachEx {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(5);
		al.add(4);
		
				
		al.forEach((i) -> System.out.println(i));
		
		System.out.println("=============================");
		
		for (int i = 1; i <= al.size(); i++) {
			System.out.println(i);
		}

		System.out.println("=============================");
		
		for(int i : al) {
			System.out.println(i);
		}
		
		

	}

}

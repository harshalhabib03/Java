package ArrayListEx;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();	//object creation default capacity 10
		
		al.add(100);
		al.add(200);
		al.add("Rahul");
		al.add("Raju");
		al.add(100.00);
		
		System.out.println(al);
		System.out.println("Size ::"+al.size());
		al.remove(0);
		System.out.println("Size ::"+al.size());
		System.out.println(al);
		
	}

}

package ArrayListExample;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentEx {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1, "Raju"));
		al.add(new Student(2, "Rani"));
		al.add(new Student(3, "Sunil"));
		al.add(new Student(4, "Ravi"));
		
		ListIterator<Student> li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("============================");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
			
		}
		
//		for (Student s : al) {
//			System.out.println(s);
//		}
		
		
//		for (int i = al.size()-1; i >=0; i--) {
//			System.out.println(al.get(i));
//		}
	}

}

package ComparableDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentEx {

	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<Student>();
		al.add(new Student(104, "John", 3));
		al.add(new Student(102, "Smith", 2));
		al.add(new Student(103, "Anna", 4));
		al.add(new Student(101, "Sancy", 1));
		
		Collections.sort(al);
		
		for (Student s : al) {
			System.out.println(s);
		}
	}

}

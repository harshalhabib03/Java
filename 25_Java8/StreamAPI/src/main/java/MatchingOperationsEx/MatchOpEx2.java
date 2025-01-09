package MatchingOperationsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchOpEx2 {

	public static void main(String[] args) {
		
		Person p1 = new Person("Pradeep", "India");
		Person p2 = new Person("John", "USA");
		Person p3 = new Person("Chong", "Japan");
		Person p4 = new Person("Steve", "Canada");
		Person p5 = new Person("Kumar", "India");
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		
		//to find first indian 
		Optional<Person> findFirst = persons.stream()
											.filter(p -> p.country.equals("India"))
											.findFirst();
		
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}
}

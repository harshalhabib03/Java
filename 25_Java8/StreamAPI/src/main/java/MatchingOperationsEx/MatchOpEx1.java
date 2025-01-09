package MatchingOperationsEx;

import java.util.Arrays;
import java.util.List;

public class MatchOpEx1 {

	public static void main(String[] args) {
		
		Person p1 = new Person("Pradeep", "India");
		Person p2 = new Person("John", "USA");
		Person p3 = new Person("Chong", "Japan");
		Person p4 = new Person("Steve", "Canada");
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4);
		
		boolean status1 = persons.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println("Any Indian Available ::"+status1);
		
		boolean status2 = persons.stream().allMatch(p -> p.country.equals("India"));
		System.out.println("All Are Indian's ::"+status2);
		
		boolean status3 = persons.stream().noneMatch(p -> p.country.equals("Mexico"));
		System.out.println("No Person from Mexico ::"+status3);
	}
}

class Person{
	String name;
	String country;
	Person(String name, String country){
		this.name=name;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
}

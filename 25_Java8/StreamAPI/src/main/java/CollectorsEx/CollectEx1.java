package CollectorsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectEx1 {

	public static void main(String[] args) {
	
		Person p1 = new Person("Pradeep", "India");
		Person p2 = new Person("John", "USA");
		Person p3 = new Person("Chong", "Japan");
		Person p4 = new Person("Steve", "Canada");
		Person p5 = new Person("Kumar", "India");
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		
		//to get collection of indian's 
		List<Person> indians = persons.stream()
											.filter(p -> p.country.equals("India"))
											.collect(Collectors.toList());
		//collect is used to collect the filtered data to new collection
		
		System.out.println(indians.size());
		
		//forEach is used to print the collected data
		indians.forEach(i -> System.out.println(i));
		
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


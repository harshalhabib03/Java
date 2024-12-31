package PredicateEx;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;

class Person{
	
	//instance variables
	String name;
	int age;
	
	//constructor
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}

public class PersonsEX {

	public static void main(String[] args) {
		
		//lists of persons to get age whose age is >=18
		Person p1 = new Person("Rahul", 46);
		Person p2 = new Person("Sonia", 16);
		Person p3 = new Person("Karthik", 14);
		Person p4 = new Person("Pradeep", 38);
		
		//listed in List class
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		//used predicate with lambda expression
		Predicate<Person> predicate = p -> p.age >=18;

		for (Person person : persons) {
			if(predicate.test(person)) {
				System.out.println(person.name);
			}
		}
	}

}

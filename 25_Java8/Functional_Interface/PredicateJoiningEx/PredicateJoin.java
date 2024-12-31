package PredicateJoiningEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	
	String name;
	String location;
	String dept;
	
	public Employee(String name, String location, String dept) {
		this.name=name;
		this.location=location;
		this.dept=dept;
	}
}

public class PredicateJoin {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ganesh", "Mumbai", "Networking");
		Employee e2 = new Employee("Suresh", "BNG", "Devops");
		Employee e3 = new Employee("Anil", "HYD", "DB");
		Employee e4 = new Employee("Karthik", "Pune", "Sales");
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1 = (e) -> e.location.equals("HYD");
		Predicate<Employee> p2 = (e) -> e.dept.equals("DB");
		Predicate<Employee> p3 = (e) -> e.name.startsWith("A");
		
		Predicate<Employee> p = p1.and(p2).and(p3);
		//Predicate<Employee> p = p1.or(p2);
		
		for (Employee emp : emps) {
			if (p.test(emp)) {
				System.out.println(emp.name);
			}
		}
 	}

}

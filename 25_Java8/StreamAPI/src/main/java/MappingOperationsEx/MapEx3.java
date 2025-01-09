package MappingOperationsEx;

import java.util.stream.Stream;

class Employee{
	String name;
	int age;
	double salary;
	
	public Employee(String name, int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
//get the emp name and age whose salary is >=50000
public class MapEx3 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Rahul", 25, 28000.00);
		Employee e2 = new Employee("Sonia", 38, 55000.00);
		Employee e3 = new Employee("Rani", 42, 32000.00);
		Employee e4 = new Employee("Raju", 48, 75000.00);
		
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4);
		
//		stream.filter(e -> e.salary >=50000.00)
//			  .map(e -> e.name+" - "+e.age)
//			  .forEach(e -> System.out.println(e));
//		
		stream.filter(e -> e.salary >=50000.00)
			  .forEach(e -> System.out.println(e.name+" - "+e.age));
	}

}

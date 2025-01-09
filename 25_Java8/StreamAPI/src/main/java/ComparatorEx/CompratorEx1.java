package ComparatorEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CompratorEx1 {
	
	//Write a java program to get MAX, MIN and AVG salary from given employees data using Stream API.
	
	public static void main(String[] args) {
		
		Employee e2 = new Employee(101, "Pradeep", 46500.00);
		Employee e1 = new Employee(102, "Kumar", 26500.00);
		Employee e3 = new Employee(103, "Ravi", 35500.00);
		Employee e4 = new Employee(104, "Arun", 16500.00);
		Employee e5 = new Employee(105, "Gopal", 25500.00);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Max Salary ::"+max.get().salary);
		
		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Min Salary ::"+min.get().salary);
		
		Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Average Salary ::"+avg);
	}
}

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
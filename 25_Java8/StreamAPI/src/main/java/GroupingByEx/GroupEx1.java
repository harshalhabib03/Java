package GroupingByEx;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEx1 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Robert", 45000.00, "USA");
		Employee e2 = new Employee(2, "David", 48000.00, "UK");
		Employee e3 = new Employee(3, "Ching", 35000.00, "Japan");
		Employee e4 = new Employee(4, "John", 25000.00, "USA");
		Employee e5 = new Employee(5, "Sudhir", 32000.00, "India");
	
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		Map<String, List<Employee>> data = list.stream()
			.collect(Collectors.groupingBy(e -> e.country));
		System.out.println(data);
	}
}

class Employee{
	int id;
	String name;
	double salary;
	String country;
	public Employee(int id, String name, double salary, String country) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}
	
}

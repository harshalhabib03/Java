package CollectorsEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEmailsEx {

	public static void main(String[] args) {
		Employees e1 = new Employees("Kumar", "HYD", "kumar@gmail.com");
		Employees e2 = new Employees("Pradeep", "BNG", "pradeep@gmail.com");
		Employees e3 = new Employees("Ravi", "HYD", "ravi@gmail.com");
		Employees e4 = new Employees("Arun", "Pune", "arun@gmail.com");
		Employees e5 = new Employees("Gopal", "Goa", "gopal@gmail.com");
		Employees e6 = new Employees("Sharath", "HYD", "sharath@gmail.com");
		
		List<Employees> names = Arrays.asList(e1, e2, e3, e4);
		
		List<String> name = names.stream()
			 .filter(n -> n.city.equals("HYD"))
			 .map(n -> n.name)
			 .collect(Collectors.toList());
		System.out.println(name);
		
		List<String> emails = names.stream()
								   .filter(e -> e.city.equals("HYD"))
								   .map(e -> e.email)
								   .collect(Collectors.toList());
		System.out.println(emails);
	}
}

class Employees{
	String name;
	String city;
	String email;
	public Employees(String name, String city, String email) {
		this.name=name;
		this.city=city;
		this.email=email;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", city=" + city + ", email=" + email + "]";
	}
	
}

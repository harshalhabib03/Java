package StreamOperationsDemo;

import java.util.stream.Stream;

public class PrintObject {

	public static void main(String[] args) {
		
		User u1 = new User("John", 25);
		User u2 = new User("Rahul", 28);
		User u3 = new User("Sonia", 34);
		User u4 = new User("Kabir", 48);
		User u5 = new User("Sunil", 57);
		User u6 = new User("Puneet", 39);
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5,u6);
		
		stream.filter(u -> u.age >= 20)
			  .filter(u -> u.name.startsWith("S"))
			  .forEach(u -> System.out.println(u));
	}

}

class User{
	String name;
	int age;
	
	User(String name, int age){
		this.name=name;
		this.age=age;
	}
						//toString is used to print content of the object
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
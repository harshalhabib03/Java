package PredicateEx;

import java.util.function.Predicate;

public class PredicateEx3 {

	public static void main(String[] args) {
		
		//getting only names starting with A char using predicate with lambda expression
		String[] names = {"Anushka", "Anupama", "Deepika", "Digvijay", "Kajal"};
		
		Predicate<String> p = name -> name.charAt(0) == 'A';
		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
	}

}

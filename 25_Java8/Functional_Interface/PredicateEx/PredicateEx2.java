package PredicateEx;

import java.util.function.Predicate;

public class PredicateEx2 {

	//using predefined Predicate interface with lambda expression
	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));
	}

}

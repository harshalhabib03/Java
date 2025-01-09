package FlatMapEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapEx1 {

	public static void main(String[] args) {
		
		List<String> javacourses = Arrays.asList("core", "adv", "spring");
		List<String> uicourses = Arrays.asList("html", "css", "bs", "js");
		List<List<String>> courses = Arrays.asList(javacourses, uicourses);
		
//		courses.stream().forEach(c -> System.out.println(c));
		
//		Stream<String> flatmap = courses.stream().flatMap(s -> s.stream());
//		flatmap.forEach(s -> System.out.println(s));
		
		courses.stream()
			   .flatMap(s -> s.stream())
			   .forEach(s -> System.out.println(s));
	}

}

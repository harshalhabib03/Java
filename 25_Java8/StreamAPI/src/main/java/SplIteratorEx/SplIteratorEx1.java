package SplIteratorEx;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplIteratorEx1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Dhoni", "Kholi", "Pandya");
		
		Spliterator<String> spl = names.stream().spliterator();
		
		spl.forEachRemaining(n -> System.out.println(n));
		
//		Spliterator<String> spl1 = spl.trySplit();
//		
//		if(spl1 != null) {
//			spl1.forEachRemaining(System.out::println);
//		}
		
	}

}

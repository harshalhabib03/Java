package MappingOperationsEx;

import java.util.Arrays;
import java.util.List;

public class MapEx1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("india", "usa", "uk", "qatar");
		
//		for (String name : names) {
//			System.out.println(name.toUpperCase());
//		}
		
		names.stream()
			 .map(name -> name.toUpperCase())
			 .forEach(n -> System.out.println(n));
		
		names.stream()
			 .map(name -> name.length())
			 .forEach(i -> System.out.println(i));
	}

}

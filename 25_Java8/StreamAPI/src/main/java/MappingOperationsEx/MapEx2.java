package MappingOperationsEx;

import java.util.Arrays;
import java.util.List;

public class MapEx2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ashok", "Anil", "Suraj", "Arvind", "Lakhan", "Ashwin", "Ankush");
		
		//print name with its length which are starting with "A" using stream api
		
		names.stream()
			 .filter(name -> name.startsWith("A"))
			 .map(name -> name+ "-" +name.length())
			 .forEach(n -> System.out.println(n));
	}

}

package StreamOperationsDemo;

import java.util.Arrays;
import java.util.List;

public class FilterNameEx {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Anupma", "Anushka", "Karthik", "Pradeep", "Ashok");
		
		list.stream()
			.filter(i -> i.startsWith("A"))
			.forEach(i -> System.out.println(i));
	}

}

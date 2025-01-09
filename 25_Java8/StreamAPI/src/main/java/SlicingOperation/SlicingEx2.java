package SlicingOperation;

import java.util.Arrays;
import java.util.List;

public class SlicingEx2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("raj", "rani", "raj", "rani", "guru");
		
		names.stream()
			 .distinct()
			 .forEach(n -> System.out.println(n));

	}

}

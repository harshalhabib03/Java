package SlicingOperation;

import java.util.Arrays;
import java.util.List;

public class SlicingEx1 {

	public static void main(String[] args) {

		List<String> jc = Arrays.asList("core", "adv", "spring", "restapi", "microservices");
		
		jc.stream()
		  .limit(3)
		  .forEach(c -> System.out.println(c));		//core, adv, spring
		
		jc.stream()
		  .skip(3)
		  .forEach(c -> System.out.println(c));		//restapi, microservices
		
		
	}

}

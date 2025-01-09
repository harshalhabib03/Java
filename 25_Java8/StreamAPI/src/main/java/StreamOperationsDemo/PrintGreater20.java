package StreamOperationsDemo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintGreater20 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(75,55,42,8,12);
		
		//Before 1.8v we want to print like this format
//		for (Integer i : al) {
//			if(i >20) {
//				System.out.println(i);
//			}
//		}
		
//		Stream<Integer> stream = list.stream();
//		Stream<Integer> filter = stream.filter(i -> i > 20);
//		filter.forEach(i -> System.out.println(i));
		
		//From Java 1.8v we can print in this format
			list.stream()
				.filter(i -> i > 20)
				.forEach(i -> System.out.println(i));
	}
}

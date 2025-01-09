package StreamCreationDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreationEx1 {

	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Anna");
		names.add("Sohail");
		
		Stream<String> stream2 = names.stream();
		System.out.println(names);
	}

}

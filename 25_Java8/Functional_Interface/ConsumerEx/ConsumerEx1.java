package ConsumerEx;

import java.util.function.Consumer;

public class ConsumerEx1 {

	public static void main(String[] args) {
		
		//Consumer only accepts but doesn't return anything
		Consumer<String> c = (name) -> System.out.println(name+", Good Morning");
		c.accept("Ashok");
		c.accept("Rohit");
	}

}

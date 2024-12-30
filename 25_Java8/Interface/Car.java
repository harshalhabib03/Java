interface Vehicle {
	public void start();

	public default void m1() {
		System.out.println("m1 method");
	}

	public default void m2() {
		System.out.println("m2 method");
	}

	public static void clean() {
		System.out.println("cleaning completed...");
	}
}

public class Car implements Vehicle {

	public void start() {
		System.out.println("car started...");
	}

	public static void main(String[] args) {
		Car c = new Car();
		Vehicle.clean();
		c.start();
	}
}
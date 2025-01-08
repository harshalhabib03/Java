package ThreadRunnableInterface;

public class ThreadEx3 {

	public static void main(String[] args) {
		//using lambda expression with Runnable 
		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}

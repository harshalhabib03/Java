package InstanceMethodRef;

public class InstanceMethodRefEx {
	
	public void m1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		InstanceMethodRefEx mi = new InstanceMethodRefEx();
		
		Runnable r = mi::m1;
		Thread t = new Thread(r);
		t.start();
		
	}

}

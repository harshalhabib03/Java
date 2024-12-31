package MethodRef;

@FunctionalInterface
interface MyInterface{
	public void m1();
}

public class MethodRefEx1 {
	
	public static void m2() {
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		
		//method reference 
		//reference to one method from another method
		MyInterface mi = MethodRefEx1::m2;
		mi.m1();
	}

}

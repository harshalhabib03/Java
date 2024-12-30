package lambdaexpressions;

interface MyInterfaceOne{
	public void m1(); 
}

//This is before 1.8version introducing
//we used interface and called creating object
public class MyAppOne implements MyInterfaceOne {

	public void m1() {
		System.out.println("m1 method called...");
	}
	public static void main(String[] args) {
		MyAppOne mao = new MyAppOne();
		mao.m1();
	}

}

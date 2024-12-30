package lambdaexpressions;

@FunctionalInterface
interface MyInterfaceTwo{
	public void m2();
}

//this type we can abled to write after coming 1.8version

public class MyAppTwo {

	public static void main(String[] args) {
		
		MyInterfaceTwo mit = () -> System.out.println("m2 method called...");
		mit.m2();
		
		//MyInterfaceTwo is Functional Interface
		//mit is reference variable
		//()-> S.o.pln("m2 method called..."); is lambda expression
		//mit.m2(); is called using reference variable name with method name
	
	}

}

//This program is with ArithmeticException

class Test1{
	public static void main(String[] args) {
		System.out.println("1");
		try{
			System.out.println("2");
			int a=100,b=0,c;
			System.out.println("3");
			c=a/b;
			System.out.println("4");	//doesn't print
			System.out.println(c);		//doesn't print
			System.out.println("5");	//doesn't print
		}
		catch (ArithmeticException e) {
			System.out.println("6");
			System.out.println(e);
			System.out.println("7");
		}
		System.out.println("Hello");
	}
}
class Test{
	public static void main(String[] args) {
		try{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);	
		}
		catch (ArithmeticException e) {
			System.out.println("you can't divide by zero");
		}
	}
}
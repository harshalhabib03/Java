class FibonacciRecur{
	static int a=0, b=1, c;
	public static void main(String[] args) {
		
		FibonacciRecur obj = new FibonacciRecur();
		obj.printFib(10);
	}

	void printFib(int i){
		if(i>=1){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			printFib(i-1);
		}
	}
}
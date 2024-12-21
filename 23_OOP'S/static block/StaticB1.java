class StaticB1{
	static{
		System.out.println("Hello");
	}
	static{
		System.out.println("second static");
	}

	//we can write static blocks wherever in program
	//but, first compiles static and then main method
	public static void main(String[] args) {
		System.out.println("main method");
	}
	static{
		System.out.println("third static ");
	}
}
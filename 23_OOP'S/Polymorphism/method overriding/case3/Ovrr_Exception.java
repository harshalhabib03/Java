class Test{
	void show() throws RuntimeException
	{
		System.out.println("1");
	}
}

class Ovrr_Exception extends Test{
	void show() throws ArithmeticException
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		Test t =new Test();
		t.show();
		Ovrr_Exception a = new Ovrr_Exception();
		a.show();
	}
}
class Test{
	Test(ThisEx t){
		System.out.println("test class constructor");
	}
}

class ThisEx{
	void m1(){
		Test t = new Test(this);
	}
	public static void main(String[] args) {
		ThisEx t = new ThisEx();
		t.m1();
	}
}
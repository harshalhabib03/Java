class Test{
	void show(){
		System.out.println("1");
	}
}

class Cann_Ovrr_Method extends Test{
	void show(){
		System.out.println("2");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show();

		Cann_Ovrr_Method a = new Cann_Ovrr_Method();
		a.show();
	}
}
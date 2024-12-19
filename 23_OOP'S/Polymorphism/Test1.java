class Test1{
	void show(int a){
		System.out.println("int method");
	}
	void show(String a){
		System.out.println("String method");
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.show("hello");
	}
}
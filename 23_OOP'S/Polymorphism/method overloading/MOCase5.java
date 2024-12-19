class MOCase5{
	void show(int a){
		System.out.println("int method");
	}
	void show(int... a){
		System.out.println("vararg method");
	}
	public static void main(String[] args) {
		MOCase5 m = new MOCase5();
		//m.show(10, 20, 30);	
		m.show();	//by default it get chance to vararg
	}
}
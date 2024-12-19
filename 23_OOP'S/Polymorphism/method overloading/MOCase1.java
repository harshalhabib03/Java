class MOCase1{
	void show(int a){
		System.out.println("int method");
	}
	void show(String a){
		System.out.println("String method");
	}
	public static void main(String[] args) {
		MOCase1 m = new MOCase1();
		m.show('a');	
		//here, a is a char & promoted to int
	}
}
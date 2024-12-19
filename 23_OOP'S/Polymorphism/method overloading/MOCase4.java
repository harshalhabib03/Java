class MOCase4{
	void show(int a, float b){
		System.out.println("int float method");
	}
	void show(float a, int b){
		System.out.println("float int method");
	}
	public static void main(String[] args) {
		MOCase4 m = new MOCase4();
		m.show(10, 20.0f);	
		m.show(20.0f, 10);	
		//m.show(10, 20);	//reference to show is ambiguous
	}
}
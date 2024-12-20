class ThisEx{
	void m1(ThisEx t){
		System.out.println("im in m1 method");
	}
	void m2(){
		m1(this);
	}
	public static void main(String[] args) {
		ThisEx t = new ThisEx();
		t.m2();
	}
}

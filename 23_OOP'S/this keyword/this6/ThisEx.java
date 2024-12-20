class ThisEx{
	ThisEx m1(){
		return this;
	}
	public static void main(String[] args) {
		ThisEx t = new ThisEx();
		t.m1();
	}
}
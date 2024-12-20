class ThisEx{
	ThisEx(){
		//this(10);
		System.out.println("no arg construct");
	}
	ThisEx(int a){
		this();
		System.out.println("parameterized construct");
	}
	public static void main(String[] args) {
		ThisEx e = new ThisEx();
		//ThisEx e = new ThisEx(10);
	}
}